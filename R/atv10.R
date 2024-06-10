library(dplyr)
library(tidyr)

# Carregar o conjunto de dados
TB <- read.csv("http://stat405.had.co.nz/data/tb.csv")
TB <- select(TB, -new_sp)

TB <- TB %>%
  gather(key = "Código", value = "N_casos", 3:22, na.rm = TRUE)

TB <- TB %>%
  separate(Código, into = c("caso", "tipo", "sexofaixa"), sep = "_")

TB <- TB %>%
  separate(sexofaixa, into = c("sexo", "faixa"), sep = 1)

TB %>%
  filter(iso2 == "TH", sexo == "m") %>%
  summarise(total_casos = sum(N_casos))

a <- TB%>% filter(iso2 == "TH")

us <- TB%>% filter(iso2 == "US")

sum(us$N_casos)/sum(TB$N_casos)


c <- TB%>% filter(faixa == "2534", sexo == "f")

sum(c$N_casos)

decada2000 <- TB %>% filter(year >= 2000)
sum(decada2000$N_casos)