library("dplyr")

df=data.frame(Theoph)


df%>%select(Dose)

df%>%filter(Dose>5)

df%>%slice(10:20)

df%>%filter(Dose>5,Time>mean(Time))

df<-df%>%arrange(desc(Wt))

df<-df%>%arrange(Wt,desc(Time))

df<-df%>%mutate(tendencia=Time-mean(Time))

df%>%summarise(max(conc))

setwd("C:\\Users\\rafae\\Documents\\R")



X673598238_T_ONTIME_REPORTING <- read.csv(file="673598238_T_ONTIME_REPORTING.csv" )


L_UNIQUE_CARRIERS <- read.csv(file = 'L_UNIQUE_CARRIERS.csv_')


merged_data <- merge(X673598238_T_ONTIME_REPORTING, L_UNIQUE_CARRIERS, by.x = "OP_UNIQUE_CARRIER", by.y = "Code", all.x = TRUE)


head(merged_data)


companhia_maior_atraso_media <- merged_data %>%
  group_by(Description) %>%
  summarise(media_atraso = mean(DEP_DELAY_NEW, na.rm = TRUE)) %>%
  arrange(desc(media_atraso))

sub_df <- merged_data %>%
  filter(DEP_DELAY_NEW > 0) %>%
  select(Description)

outro_df <- sub_df %>%
  count(Description)

library(dplyr)

# Remover as linhas sem informações de atrasos
merged_data_sem_na <- merged_data %>%
  filter(!is.na(DEP_DELAY_NEW))

# Calcular a proporção de atrasos para cada companhia
proporcao_atrasos <- merged_data_sem_na %>%
  group_by(Description) %>%
  summarise(prop_atrasos = sum(DEP_DELAY_NEW > 0) / n())

# Encontrar a companhia com a maior proporção de atrasos
companhia_maior_prop_atrasos <- proporcao_atrasos %>%
  arrange(desc(prop_atrasos))

