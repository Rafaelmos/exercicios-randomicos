library(rvest)

page <- read_html("https://www.culturagenial.com/poema-no-meio-do-caminho-de-carlos-drummond-de-andrade/")

conteudo <- page %>%
  html_nodes(xpath = "//blockquote/p") %>%
  html_text2()

print(conteudo)

nchar(conteudo)

