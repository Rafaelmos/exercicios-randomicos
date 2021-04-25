nome = "Robozinho"
posicao = [0,0]
direcao = "Norte"

def iniciarRobot():
    print(f"""{nome} inicou
    a posição atual do {nome} é: {posicao}
    a direção atual do {nome} é: {direcao} """)
    
def statusRobot():
    print(f"""A posição atual do {nome} é: {posicao}
    a direção atual do {nome} é: {direcao}""")

def andarUmPasso():
    print(posicao)
    if (direcao is "Norte"):
        posicao[1]+=1
        return posicao
    elif (direcao=="Sul"):
        posicao[1]-=1
        return posicao
    elif (direcao=="Leste"):
        posicao[0]+=1
        return posicao
    elif (direcao=="Oeste"):
        posicao[0]-=1
        return posicao

def andarVariosPasso():
    andar = int(input("Digite quantos passos você quer andar: "))
    if (direcao is "Norte"):
        posicao[1]+=1
    elif (direcao=="Sul"):
        posicao[1]-=1
    elif (direcao=="Leste"):
        posicao[0]+=1
    elif (direcao=="Oeste"):
        posicao[0]-=1

def mudarPosicao():
    x = int(input("Digite a posição x: "))
    y = int(input("Digite a posição y: "))
    posicao[0]=x
    posicao[1]=y

def mudarDirecao():
        print("""ESCOLHA A NOVA DIREÇÃO
        [0] = Norte
        [1] = Sul
        [2] = Leste
        [3] = Oeste""")

        novadirecao = int(input("Escolha a opção: "))

        if novadirecao == 0:
            direcao = "Norte"
            print(f"A nova direção atual é {direcao}")
        elif novadirecao == 1:
            direcao = "Sul"
            print(f"A nova direção atual é {direcao}")
        elif novadirecao == 2:
            direcao = "Leste"
            print(f"A nova direção atual é {direcao}")
        elif novadirecao == 3:
            direcao = "Oeste"
            print(f"A nova direção atual é {direcao}")
        else:
            print("OPÇÃO INVALIDA, ESCOLHA UMA OPÇÃO CORR3ETA")
            mudarDirecao()

def retornaPosZero( ):
    posicao = [0,0]
    direcao = "Norte"


# iniciarRobot()
# andarUmPasso()
# iniciarRobot()
# mudarPosicao()
# iniciarRobot()
# mudarDirecao()
# statusRobot()
