vitimas = []
opcao = ""
constanteLinha = 80
print("_"*constanteLinha)
print("Seja Bem-vindo ao Death Note Digital")
#conveção de opção para saída = "s"
while (opcao != "s") :
    print("_"*constanteLinha)
    print("----------------MENU----------------")
    print("Escolha sua opção para continuar")
    print("a - Exibir lista de vitimas do DND")
    print("b - Adicionar um nome da lista do DND")
    print("c - Remover um nome da lista do DND POP")#METODOPOP
    print("d - Remover um nome da lista do DND")#METODOREMOVE
    print("s - Finalizar Programa")
    opcao = input("Digite sua opção: ")
    print("_"*constanteLinha)

    if (opcao == "a"):
        print(vitimas)

    elif (opcao == "b"):
        nome = (input("Digite um nome: "))
        vitimas.append(nome)

    elif (opcao == "c"):
        print(vitimas)
        casa = int(input("Digite a casa para ser removida: "))
        if (casa > 0 and casa,len(vitimas)):
            vitimas.pop(casa)
        print (f"A casa {casa} foi removida da lista")
        print (vitimas)
        print("\n"*1)
                       
    elif (opcao == "d"):
        print(vitimas)
        nome = (input("Digite o nome para ser removido da lista: "))
        vitimas.remove(nome)
        print (f"O nome {nome} foi removido da lista")
        print(vitimas)
        print("\n"*1)
        

    elif (opcao == "s"):
        print("Programa Finalizado")

    else :
        print("Opção inválida. Por favor, digite outra opção")
    print("\n"*2)
