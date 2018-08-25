library(effsize)
library(xtable)
options(scipen=999)

qmosa <- read.csv("qmosa.csv")
rmosa <- read.csv("rmosa.csv")

# getting commong projects
qmosa_projects <- c(unique(as.character(qmosa$TARGET_CLASS)))
rmosa_projects <- c(unique(as.character(rmosa$TARGET_CLASS)))

projects <- intersect(qmosa_projects, rmosa_projects)
 
compare_strategies <-function(baseline, strategy, dimension, projects) { 
  # Compares two strategies according a given dimension
  # @param baseline: baseline to compare with, MOSA in this case
  # @param strategy: rival strategy vs the baseline 
  # @param dimension: can be time_diff or heap_diff
  # @param projects: the classes to analyze
  #
  # @return a data frame with the pvalue, cliff delta and magnitude
  # 
  p_values <- c()
  average1 <- c()
  average2 <- c()
  cliff_delta <- c()
  cliff_estimate <- c()
  
  alt <- 'two.sided'

  for (project in projects) {
    subset_baseline <- baseline[baseline$TARGET_CLASS == project,]
    subset_strategy <- strategy[strategy$TARGET_CLASS == project,]
    values_baseline <- subset_baseline[,dimension]
    values_strategy <- subset_strategy[,dimension]
    average1 <- c(average1, mean(values_baseline))
    average2 <- c(average2, mean(values_strategy))
    # if ((all.equal(mean(values_baseline), NaN)) & (all.equal(mean(values_strategy), NaN))) {
    #  p_values <- c(p_values, NaN)
    #  cliff_delta <- c(cliff_delta, NaN)
    #  cliff_estimate <- c(cliff_estimate, NaN)
    # } else  {
     p_values <- c(p_values, wilcox.test(values_baseline, values_strategy, alternative = alt, paired = F)$p.value)
     res_delta <- VD.A(values_baseline, values_strategy, paired = F)
     cliff_delta <- c(cliff_delta, res_delta$estimate)
     cliff_estimate <- c(cliff_estimate, as.character(res_delta$magnitude))
    # }
  }
  df <- data.frame(projects, average1, average2, p_values, cliff_delta, cliff_estimate)
  return(df)
}


compare_coverage <- function() {
  print('Comparing Branch Coverage')
  frame <- compare_strategies(qmosa, rmosa, "BranchCoverage", projects)
  valid <- subset(frame, p_values<=0.05)
  good <- valid[valid$cliff_delta <= 0.50, ]
  bad <- valid[valid$cliff_delta > 0.50, ]
  colnames(frame) <- c("class", "qmosa", "rmosa", "p-value", "d", "magnitude")
  print(paste0("Good Cases = ", nrow(good)))
  print(paste0("Bad Cases = ", nrow(bad)))
  write.csv(frame, "branch-coverage.csv", row.names=F)
  return(frame)
}

compare_entropy <- function() {
  print('Comparing Coverage Entropy')
  frame <- compare_strategies(qmosa, rmosa, "CoverageEntropy", projects)
  valid <- subset(frame, p_values <= 0.05)
  good <- valid[valid$cliff_delta >= 0.50, ]
  bad <- valid[valid$cliff_delta < 0.50, ]
  colnames(frame) <- c("class", "qmosa", "rmosa", "p-value", "d", "magnitude")
  print(paste0("Good Cases = ", nrow(good)))
  print(paste0("Bad Cases = ", nrow(bad)))
  write.csv(frame, "entropy.csv", row.names=F)
  return(frame)
}

compare_quality <- function(quality) {
  quality_q <- read.csv("qmosa_quality.csv")
  quality_r <- read.csv("rmosa_quality.csv")
  print('Comparing Coupling')
  aux_q <- c(unique(as.character(quality_q$TARGET_CLASS)))
  aux_r <- c(unique(as.character(quality_r$TARGET_CLASS)))
  projects_q <- intersect(aux_q, aux_r)
  frame <- compare_strategies(quality_q, quality_r, quality, projects_q)
  valid <- subset(frame, p_values <= 0.05)
  good <- valid[valid$cliff_delta >= 0.50, ]
  bad <- valid[valid$cliff_delta < 0.50, ]
  colnames(frame) <- c("class", "qmosa", "rmosa", "p-value", "d", "magnitude")
  print(paste0("Good Cases = ", nrow(good)))
  print(paste0("Bad Cases = ", nrow(bad)))
  write.csv(frame, paste(quality, ".csv", sep=""), row.names=F)
  return(frame)
}

