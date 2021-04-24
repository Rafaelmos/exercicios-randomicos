lista = [ 2 , 0, 5 , 8 ,  9]
print (lista)
v = int(input("Digite o valor a ser procurado: "))
if v not in  lista:
    print ("valor nao existe na lista")
else:
    indice = lista.index(v)
    antecessor = indice-1
    tamanho = len(lista)
    sucessor = indice+1
    if sucessor >= tamanho:
        print(f"Antecessor de {v} é {lista[antecessor]}")
        print(f"Sucessor não exite")
    elif antecessor <= tamanho-(tamanho+1):
        print(f"Antecessor não exite")
        print(f"Sucessor de {v} é {lista[sucessor]}")
    elif antecessor >= tamanho-(tamanho+1) and tamanho >= sucessor:
        print(f"Antecessor de {v} é {lista[antecessor]}")
        print(f"Sucessor de {v} é {lista[sucessor]}")
