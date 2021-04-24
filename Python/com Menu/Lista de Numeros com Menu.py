listaNumeros = [100,50]
opcao = ""
constanteLinha = 80
print("_"*constanteLinha)
print("Seja Bem-vindo ao Programa")
#conveção de opção para saída = "s"
while (opcao != "s") :
    print("_"*constanteLinha)
    
#Menu
    print("----------------MENU----------------")
    print("Escolha sua opção para continuar")
    print("a - Exibir lista")
    print("b - Adicionar um número a lista")
    print("c - Exibir o maior número da lista")
    print("d - Exibir o menor número da lista")
    print("e - Exibir a média dos números da lista")
    print("f - Exibir números pares da lista")
    print("g - Exibir números impares da lista")
    print("s - Finalizar Programa")
    opcao = input("Digite sua opção:")
    print("_"*constanteLinha)
    
#Exibir lista
    if (opcao == "a"):
        print(listaNumeros)

#Adicionar um número a lista
    elif (opcao == "b"):
        numero = int(input("Digite um número:"))
        listaNumeros.append(numero)
        
#Exibir o maior número da lista
    elif (opcao == "c"):
        maior = 0
        if (len(listaNumeros)>=1):
            maior = listaNumeros[0]
            for numero in listaNumeros:
                if (maior < numero):
                    maior = numero
            print("Maior número:",maior)
        else:
            print("Lista Vazia")
            
#Exibir o menor número da lista
    elif (opcao == "d"):
        menor = 0
        if (len(listaNumeros)>=1):
            menor = listaNumeros[0]
            for numero in listaNumeros:
                if (menor > numero):
                    menor = numero
            print("Menor número:",menor)
        else:
            print("Lista Vazia")
            
#Exibir a média dos números da lista
    elif (opcao == "e"):
        divisor = (len (listaNumeros[:]))
        somatotal = sum(listaNumeros)
        print ("O valor total é",somatotal, f"e vão ser dividos por {divisor}")
        media = (somatotal/divisor)
        print("Média",media)
#Exibir números pares da lista
    elif (opcao == "f"): 
        listaPares = []
        for numero in listaNumeros:
            if (numero % 2 == 0):
                listaPares.append(numero)
        print("Lista de Pares")
        print(listaPares)

#Exibir números impares da lista
    elif (opcao == "g"):
        listaImpares = []
        for numero in listaNumeros:
            if (numero % 2 != 0 and numero !=0):
                listaImpares.append(numero)
        print("Lista de Impares")
        print(listaImpares)

    elif (opcao == "s"):
        print("Programa Finalizado")

    else :
        print("Opção inválida. Por favor, digite outra opção")
    print("\n"*2)
