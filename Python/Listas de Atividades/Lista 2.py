#Lista 2
#Questão 1
z = int(input("Digite a quantidade de variaveis "))
for i in range(z):
  i = int (input("Digite um número "))
  if (i % 2 != 0 and i>0):
      print ("O número é ímpar e positivo")
  elif (i % 2 ==0 and i < 0):
      print ("O número é par e negativo")
  elif (i % 2 ==0 and i > 0 ):
      print ("O número é par e positivo")
  elif (i==0):
      print ("O número é par e neutro")
  else:
     print ("O número é ímpar e negativo")


#Questão 2

s = 0 #s é soma
q = 0 #q é quantidade 
z = int(input("Digite a quantidade de variaveis ")) #z equivale a quantidade de variaveis
for i in range(z):
  i = int(input("Digite um número ")) #i é a variavel dos números
  if (i % 2 ==0):
    s += i
    q += 1
if (q!= 0):
  print("Media",s/q)
else:
  print("Não foi encontrado nenhum número par")

#Questão 3

nota = 0 #valor das notas
qnotas = 0 #quantidade de notas
z = int(input("Digite a quantidade de variaveis ")) 
for i in range(z):
  i = int(input("Digite um número "))
  nota += i
  qnotas += 1
  media = (nota/qnotas)
if (media<5):
    print (f"Reprovado, pois sua média foi {media}")
elif (media >=5 and media < 7):
  print (f"Recuperação, pois sua média foi {media}")
else:
  print (f"Aprovado, pois sua média foi {media}")

#Questão 4

idade = int(input("Digite a idade do nadador "))
if (idade >= 5 and idade <= 7):
  print ("Categoria A")
elif (idade >= 8 and idade <= 10):
  print ("Categoria B")
elif (idade >= 11 and idade <= 13):
  print ("Categoria C")
elif (idade >= 14 and idade <= 18):
  print ("Categoria D")
elif (idade <= 4):
  print ("Não tem categoria")
else:
  print ("Categoria E")