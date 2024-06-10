library('rvest')

titulos <- c()
fontes <- c()

for (i in seq(1, 3, by = 1)) {
  url <- paste0("https://www.researchgate.net/search/publication?q=Linguagem%2BR&page=",i) 
  pagina <- read_html(url)

  titulo <- pagina %>%
    html_elements(css = ".nova-legacy-v-publication-item__title") %>%
    html_text2()
  
  titulos <- append(titulos, titulo)
  
  fonte <- pagina %>%
    html_elements(css = ".nova-legacy-v-publication-item__person-list") %>%
    html_text2()
  
  fontes <- append(fontes, fonte)
  
  print(url)
}

df <- data.frame(
  Titulo = titulos,
  Fonte = fontes
)