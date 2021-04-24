
def lerArquivo():
    arquivo = open("C:/Users/Usuário/Favorites/Desktop/python/Nic.txt","r")

    baseDados =list()
    dados = arquivo.readlines()
    for i in dados:
        dicionario = dict()
        dicionario['nome'],dicionario['idade'],dicionario['curso'] = i.split(" ")
        baseDados.append(dicionario)
    return baseDados

base = lerArquivo()
for i in base:
    print("Nome: "+i['nome'])
    print("Idade: " + i['idade'])
    print("Curso: " + i['curso'])
lerArquivo()


