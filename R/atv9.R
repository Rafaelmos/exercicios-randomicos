pardal <- read.csv(file = "Sparrows.csv", header = TRUE,)

View(pardal)

which(is.na(pardal))

which(duplicated(pardal))

pardal[23,]
pardal[37,]
pardal[140,]



str(pardal)

unique(pardal$Sex)


is.factor(pardal$Sex)
pardal$Sex <- as.factor(pardal$Sex)

levels(pardal$Sex)


levels(pardal$Sex) [1] <- "Female"
levels(pardal$Sex) [2] <- "Female"

levels(pardal$Sex) [3] <- "Male"


mean(pardal$Tarsus[pardal$Sex=="Female"], na.rm = TRUE)
mean(pardal$Tarsus[pardal$Sex=="Male"], na.rm = TRUE)

pardal$Wing[64] <- 59
pardal$Wing[250] <- 56.5
pardal$Wing[806] <- 57

which(is.na(pardal$Wing))

mean(pardal$Wing)

Sparrows_Ordenado <- pardal[order(pardal$Wing, pardal$Head),]



