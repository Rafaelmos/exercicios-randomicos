vogais= ['a','e','i','o','u','A','E','I','O','U']

vogal = open ("vogal.txt",'w') # Abrir e escrever (devido ao 'w') no arquivo vogal.txt
consoante = open ("consoante.txt",'w') #Mesma coisa de cima
nomes = open ("nome.txt","r") #Ler arq nome
for nome in nomes.readlines():
      if nome[0] in vogais:
            vogal.write(f"{nome}")
      else:
            consoante.write(f"{nome}")
vogal.close()
consoante.close()

"""
f = open("nome.txt")
ler = f.read()
f.close()
print (ler)

f1 = open("vogal.txt")
ler1 = f1.read()
f1.close()
print (ler1)

f2 = open("consoante.txt")
ler2 = f2.read()
f2.close()
print (ler2)
"""
