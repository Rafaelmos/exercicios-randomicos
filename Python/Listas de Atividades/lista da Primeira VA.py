"""
#Q2
peso = float(input("Digite o peso:"))
peso = peso * 1000
novoPeso = (peso * 0,12) + peso
print ("Peso em gramas:", peso," Novo Peso:", novoPeso)
#print (f"Peso em gramas: {peso} Novo Peso:{novoPeso}")
"""

"""
#Q3
velocidade = float(input("Digite a velocidade em km/h"))
tempo = float(input("Digite o tempo da viagem"))
media = float(input("Digite a média de combustível em km/l"))

combustivel = (velocidade * tempo) / media

print (velocidade, tempo, media, combustivel)
"""

"""
#Q4
texto = input("Digite uma palavra")

textoSemEspaco = ""
for i in texto:
    if i != " ":
        textoSemEspaco += i + invertida

invertida = ""
for i in textoSemEspaco:
    if i != " ":
        invertida = i + invertida

if invertida == textoSemEspaco:
    print("é palíndromo")
else :
    print ("não é palíndromo")

"""
"""
#Q5
palavra1 = input("Digite uma palavra1")
palavra2 = input("Digite uma palavra2")
maior = ""
menor = ""
if (len(palavra1) > len(palavra2)) :
    maior = palavra1
    menor = palavra2
else :
    maior = palavra2
    menor = palavra1

mistura = ""
count = 0
for i in range(0,len(menor),1) :
    mistura = mistura + menor[i]+ maior[i]
    count = i
#mistura = mistura + maior[count+1:len(maior-1)]
for i in range(count + 1, len(maior), 1):
    mistura = mistura + maior[i]

print(mistura)
"""

"""
#Q6
texto = ""
while (len(texto) == 0 or len(texto) > 100) :
    texto = input("Digite um texto de no máximo 100 carácteres:")

i = count = 0

if (len(texto) > 1) :
    while i < len(texto) :
        if (texto[i-1] == texto[i]) :
            count += 1
            i += 2
        else :
            i += 1

print("Quantidade de letras repetidas:", count)

segundoTexto = input("Digite um texto")
#print ("Qdade Palavras repetidas:", texto.count(segundoTexto))
            
count = 0
lista = []

#Neste laço abaixo, geraremos todas as substrings possíveis com o
#mesmo tamanho da segundo texto
for i in range(0, len(texto), 1):
    lista.append(texto[i: (i + len(segundoTexto))])

#Aqui só valos comparar todas as substrings geradas acima com o segundoTexto
for palavra in lista:
    if (palavra == segundoTexto) :
            count += 1
print("Quantidade de vezes que o segundo texto aparece no primeiro texto:",count)

#Agora vamos verificar se o segundo texto é prefixo do primeiro extraindo
#uma substring que vai de 0 até o tamanho do segundo texto.
#Isto é, o segundo texto deve aparecer no início do segundo.
substring = texto[0: len(segundoTexto)]
if (substring == segundoTexto) :
    print(segundoTexto + " é prefixo do primeiro texto")
else :
    print(segundoTexto + " não é prefixo do primeiro texto")
            
"""
"""
#Q7
idades = []
alturas = []
for i in range(5):
    idade = int(input("Digite uma idade:"))
    altura = float(input("Digite uma altura:"))
    idades.append(idade)
    alturas.append(altura)

for i in range(4,-1,-1) :
    print ("Idade:", idades[i], " Altura:", alturas[i])

#print(idades[::-1])
#print(alturas[::-1])
"""





            
            




























