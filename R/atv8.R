






caracols <- read.csv(file =  "Snail_feeding.csv", header = T, strip.white = T, na.strings = "")

str(caracols)


#fileURL <- ("https://www.dropbox.com/s/9wnr69i6bjhqyct/Snail_feeding.csv")

#download.file ( fileURL , destfile = "C:\\Users\\rafae\\Documents\\R\\Snail_feeding.csv", method = "curl")


list.files("C:\\Users\\rafae\\Documents\\R")

setwd("C:\\Users\\rafae\\Documents\\R")

caracols <- caracols[, 1:7]

caracols$Distance <- as.character(caracols$Distance) 

caracols$Distance <- as.numeric(caracols$Distance) 

which(is.na(caracols$Distance))

caracols[682,"Distance"] <- 0.58
caracols[755,"Distance"] <- 0.356452

which(is.numeric(caracols$Depth))

summary(caracols)

mean(caracols$Depth)

caracols$Distance[which.max(caracols$Size=="small" & caracols$Sex=="female")]