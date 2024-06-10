library("stringr")

#texto <- "João tem 30 anos e Maria 25. Eles têm números de telefone diferentes: João - (123) 456-7890 e Maria - 098-765-4321. Além disso, eles têm endereços de e-mail diferentes: joao@example.com e maria@email.com. Ambos nasceram em 1990. João trabalha na empresa XYZ, enquanto Maria é freelancer. Pedro tem 28 anos e possui o número (111) 222-3333 e o e-mail pedro@example.com. Ana, com 29 anos, tem o telefone 999-888-7777 e o e-mail ana@example.com"
#str_extract_all(texto, pattern="([0-9]+) anos")[[1]]
#str_extract_all(texto, pattern="\\(?[0-9]+\\)?[-\\s]?[0-9]+-[0-9]+")[[1]]
#str_extract_all(texto, pattern="[a-z]+@[a-z]+.com")[[1]]

setwd("C:/Users/rafae/Documents/R/")

forbes <- read.csv('Forbes2000_V2.csv')
#read.csv('https://www.dropbox.com/s/rl86524vniqb8fh/Forbes2000_V2.csv?dl=1')

ranqueamento <- function(ranque, categoria=NULL, opcao) {
  # Verifica se a opção fornecida é válida
    stop("Opcao invalida. A opcao deve ser 1 para ranqueamento geral ou 2 para ranqueamento por categoria.")
  }
  
  # Carrega o dataset forbes
  
  # Realiza o ranqueamento geral
  if(opcao == 1) {
    # Verifica se o ranque solicitado existe no dataset
    if(ranque > nrow(forbes)) {
      stop("O ranque solicitado excede o número total de empresas no dataset.")
    }
    
    # Ordena o dataset pelo valor de mercado (marketvalue)
    forbes_ordenado <- forbes[order(forbes$marketvalue, decreasing = TRUE), ]
    
    # Extrai os dados da empresa no ranque especificado
    empresa <- forbes_ordenado[ranque, "name"]
    valor_mercado <- forbes_ordenado[ranque, "marketvalue"]
    categoria <- forbes_ordenado[ranque, "category"]
    
    # Retorna os dados da empresa no ranque especificado
    return(list(empresa = empresa, categoria = categoria, ranque = ranque, valor_mercado = valor_mercado))
  }
  
  # Realiza o ranqueamento por categoria
  if(opcao == 2) {
    # Verifica se a categoria fornecida é válida
    if(!(categoria %in% unique(forbes$category))) {
      stop("Categoria invalida. Por favor, forneça uma categoria válida.")
    }
    
    # Filtra o dataset de acordo com a categoria fornecida
    forbes_categoria <- subset(forbes, category == categoria)
    
    # Verifica se a categoria possui empresas no dataset
    if(nrow(forbes_categoria) == 0) {
      stop("Não há empresas nesta categoria no dataset.")
    }
    
    # Verifica se o ranque solicitado existe na categoria
    if(ranque > nrow(forbes_categoria)) {
      stop("O ranque solicitado excede o número total de empresas nesta categoria.")
    }
    
    # Ordena o dataset filtrado pelo valor de mercado (marketvalue)
    forbes_categoria_ordenado <- forbes_categoria[order(forbes_categoria$marketvalue, decreasing = TRUE), ]
    
    # Extrai os dados da empresa no ranque especificado na categoria
    empresa <- forbes_categoria_ordenado[ranque, "name"]
    valor_mercado <- forbes_categoria_ordenado[ranque, "marketvalue"]
    
    # Retorna os dados da empresa no ranque especificado na categoria
    return(list(empresa = empresa, categoria = categoria, ranque = ranque, valor_mercado = valor_mercado))
  }
}

#Diversified financials

retorno <- ranqueamento(ranque=7, categoria="Banking", opcao=2)
do.call(rbind, retorno)

library("ggplot2")
library("dplyr")
library('magrittr')


help(diamonds)

data("diamonds")


mean(diamonds$price[diamonds$cut == "Very Good" & diamonds$carat > 0.7])

#Qual a cor (color ) do diamante que possui o menor preço (price) com mais de  0.5 quilates (carat)  ?
diamantes_maior_05 <- subset(diamonds, carat > 0.5)
indice_menor_preco <- which.min(diamantes_maior_05$price)
diamantes_maior_05$color[indice_menor_preco]


nrow(subset(diamonds, cut == "Premium"))/nrow(diamonds)

install.packages("AER")


library("AER")
library("dplyr")

data("Fertility") 

Fertility<-select(slice(Fertility,35:50),age,work)



nrow(filter(Fertility, morekids == "yes" & work > 30) )/ nrow(Fertility)

subar <- filter(Fertility, age >= 22 & age <= 24)

nrow(filter(subar, gender1 == "male"))/nrow(subar)


library(dplyr)
library(tidyr)

catfish <- read.csv("Catfish.csv")
treatment <- read.csv("Treatment.csv")

# (a) Converter o dataframe Catfish.csv para o formato longo
catfish_long <- catfish %>%
  pivot_longer(cols = c(March, April), names_to = "Month", values_to = "Weight")

# (b) Unir as colunas Genus e Species em uma variável Species
catfish_long <- catfish_long %>%
  mutate(Species = paste(Genus, Species, sep = ".")) %>%
  select(-Genus, -Species)

# (c) Combinar os dados de Treatment.csv e Catfish.csv
catfish_treatment <- merge(catfish_long, treatment, by = "Tank")




filtro <- catfish_treatment %>%
  filter(Month == "April" & Food == "Treatment2")

mean(filtro$Weight)
##

bagres_peso_80 <- catfish_treatment %>%
  filter(Weight >= 80)

nrow(filter(bagres_peso_80, Food == "Treatment1" & Tank == "Tank1"))
nrow(filter(bagres_peso_80, Food == "Treatment1" & Tank == "Tank2"))
nrow(filter(bagres_peso_80, Food == "Treatment2" & Tank == "Tank1"))
nrow(filter(bagres_peso_80, Food == "Treatment2" & Tank == "Tank2"))

Jogador<-c("LeBron James", "Kevin Durant", "Stephen Curry", "Giannis Antetokounmpo")
PPG<-c(25.0, 28.3, 30.1, 20.7)
APG<-c(7.7, 5.0, 6.7, 5.9)
RPG<-c(7.9, 7.1, 5.5, 11.1)

zscore <- function(a) {
  return (a - mean (a)) / sd (a)
}

LeBron = c(PPG[1], APG[1], RPG[1])
Kevin = c(PPG[2], APG[2], RPG[2])
Stephen = c(PPG[3], APG[3], RPG[3])
Giannis = c(PPG[4], APG[4], RPG[4])

sum(zscore(LeBron))
sum(zscore(Kevin))
sum(zscore(Stephen))
sum(zscore(Giannis))

setwd("C:/Users/rafae/Documents/R/")

dados <- read.csv("Universal2023_ResultadoPreliminar.csv", sep = ",")

names(dados)

dados$Total.Aprovado <- gsub(",", ".", dados$Total.Aprovado)
dados$Total.Aprovado <- as.numeric(dados$Total.Aprovado)


# Calcular a soma dos valores na coluna Total.Aprovado
soma_total <- sum(dados$Total.Aprovado)

# Criar a nova coluna com os valores normalizados
dados$Nova_Coluna <- dados$Total.Aprovado / soma_total


# Calcular a taxa de aprovação por região
taxa_aprovacao_por_regiao <- aggregate(Total.Aprovado ~ Região, data = dados, FUN = mean)

# Renomear a coluna resultante para refletir que é uma taxa de aprovação
colnames(taxa_aprovacao_por_regiao)[2] <- "Taxa.Aprovacao"



#
# 1. Filtrar os dados para incluir apenas instituições do Nordeste
dados_nordeste <- subset(dados, UF %in% c("AL", "BA", "CE", "MA", "PB", "PE", "PI", "RN", "SE"))

# 2. Calcular a captação total de recursos para cada instituição
captação_total <- aggregate(Total.Aprovado ~ Instituição, data = dados_nordeste, sum)

# 3. Classificar as instituições com base na captação total de recursos
captação_total <- captação_total[order(captação_total$Total.Aprovado, decreasing = TRUE), ]

# 4. Determinar a classificação da UFRPE em relação às outras instituições do Nordeste
classificação_UFRPE <- which(captação_total$Instituição == "UFRPE")

# Exibir a classificação da UFRPE
print(paste("Classificação da UFRPE em termos de captação total de recursos no Nordeste:", classificação_UFRPE))



# Exibir o resultado
print(taxa_aprovacao_por_regiao)
library("AER")
library("dplyr")
filtro <- filter(dados, Região == "NE")
filtroUFPE <- filter(dados, Instituição == "UFPE")
filtroUFC <- filter(dados, Instituição == "UFC")
filtroUFPB<- filter(dados, Instituição == "UFPB")
filtroUFRN<- filter(dados, Instituição == "UFRN")
filtroUFBA<- filter(dados, Instituição == "UFBA")

sum(filtroUFPE$Total.Aprovado)
sum(filtroUFC$Total.Aprovado)
sum(filtroUFPB$Total.Aprovado)
sum(filtroUFRN$Total.Aprovado)
sum(filtroUFBA$Total.Aprovado)




