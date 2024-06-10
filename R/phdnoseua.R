library('rvest')

phdnoseua <- read_html("https://phdnoseua.com.br/projeto-partiu-usa-v3-quente/?utm_source=quente&utm_medium=00_CAPTURA_OBRIGADO_CONVITE&utm_campaign=PPUSA0524&utm_content=CAP_114_PPUSA0524&utm_term=youtube&gclid=CjwKCAjwrvyxBhAbEiwAEg_KgumVRHcmMAUU-h0KqwTWkLXxQoBfFw5B3Njh7zUKJF6b7z8gBdrFYRoCbLMQAvD_BwE")

texto <- html_elements(phdnoseua ,css =  ".elementor-element-1917f68f .elementor-size-default") %>% 
  html_text()

print(texto)