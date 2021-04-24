
''' Questão 1'''
vogais= ['a','e','i','o','u','A','E','I','O','U']
 
vogal = open ("C:/Users/Usuário/Favorites/Desktop/python/vogal.txt",'w') # Abrir e escrever (devido ao 'w') no arquivo vogal.txt
consoante = open ("C:/Users/Usuário/Favorites/Desktop/python/consoante.txt",'w') #Mesma coisa de cima
nomes = open ("C:/Users/Usuário/Favorites/Desktop/python/nome.txt","r") #Ler arq nome
for nome in nomes.readlines():
      if nome in vogais[0]:
            vogal.write(f"{nome}")
      else:
            consoante.write(f"{nome}")
vogal.close()
consoante.close()


###################
'''Questão 2'''
def lerArquivo():

    arq = open ('C:/Users/Usuário/Favorites/Desktop/python/NiC.txt', 'r')
    lista=list()
    dados= arq.readlines()
    for i in dados:
        dicionario = dict()
        dicionario['nome'],dicionario['idade'],dicionario['curso'] = i.split(" ")
        lista.append(dicionario)
    return lista

base = lerArquivo()
for i in base:
    print("Nome: "+ i['nome']
    print("Idade: " + i['idade'])
    print("Curso: " + i['curso'])
lerArquivo()
############################




