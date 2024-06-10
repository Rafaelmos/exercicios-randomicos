dados <- c(5, 7, 12, 15, 10)

length(dados)

mean(dados)

var(dados)

e <- 300
sd <- 4250
alpha <- 0.9
nc <-(1-alpha)/2
n <-((qnorm(nc, lower.tail = F)*sd)/e)^2


e <- 1.5
sd <- 5
alpha <- 0.955
N <- 1500
nc <-(1-alpha)/2
n2 <- (qnorm(nc, lower.tail = F)^2*sd^2*N)/((e^2*(N-1))+(qnorm(nc)^2*sd^2))
       

e <- 1
sd <- (30-10)/4
alpha <- 0.98
nc <-(1-alpha)/2
n3 <-((qnorm(nc, lower.tail = F)*sd)/e)^2



e <- 1
sd <- (30-10)/4
alpha <- 0.98
N <- 5000
nc <-(1-alpha)/2
n4 <- (qnorm(nc, lower.tail = F)^2*sd^2*N)/((e^2*(N-1))+(qnorm(nc)^2*sd^2))



media <- 50
sd <- 10
dias <- 30
(1 - pnorm(dias, mean = media, sd = sd))*100

pnorm(dias, mean = media, sd = sd)*100

(1-pnorm(1))*100
(pnorm(-2))*100
(pnorm(0))*100
(1-pnorm(1.28))*100

z <- qnorm(0.9)
media <- 0.9
sd <- 21
x <- z * sd + media

perc<-0.95
sd <-3.8
media <- 30.2
n <- 100
nc <- (1-perc)/2
error <- sd/sqrt(n)
left <- media-(qnorm(nc, lower.tail = F)*error)
right <- media+(qnorm(nc, lower.tail = F)*error)

cat("[",left, "-", right,"]")


perc<-0.90
sd <- 47
media <- 658
n <- 100
nc <- (1-perc)/2
error <- sd/sqrt(n)
left <- media-(qnorm(nc, lower.tail = F)*error)
right <- media+(qnorm(nc, lower.tail = F)*error)

cat("[",left, "-", right,"]")


ligas <- c(4.37, 3.63, 2.78, 5.46, 2.18, 6.07, 3.24, 5.89, 4.86, 4.64)
sd <- sd(ligas)
perc <- 0.90
media <- mean(ligas)
n <- 10
nc <- (1 - perc) / 2
error <- sd / sqrt(n)
left <- media - (qt(nc, df = n - 1, lower.tail = FALSE) * error)
right <- media + (qt(nc, df = n - 1, lower.tail = FALSE) * error)

cat("[",left, "-", right,"]")