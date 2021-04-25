nome = "Robozinho"
posicao = [0, 0]
direcao = ["Norte"]


def iniciarRobot():
    print(f"""{nome} inicou
    a posição atual do {nome} é: {posicao}
a direção atual do {nome} é: {direcao[0]} """)



def statusRobot():
    print(f"""A posição atual do {nome} é: {posicao}
S direção atual do {nome} é: {direcao[0]} """)
1

def andarUmPasso():
    print(posicao)
    if (direcao == "Norte"):
        posicao[1] += 1
    elif (direcao == "Sul"):
        posicao[1] -= 1
    elif (direcao == "Leste"):
        posicao[0] += 1
    elif (direcao == "Oeste"):
        posicao[0] -= 1
    print(f"O {nome} andou")


def andarVariosPasso():
    andar = int(input("Digite quantos passos você quer andar: "))
    if (direcao == "Norte"):
        posicao[1] += andar
    elif (direcao == "Sul"):
        posicao[1] -= andar
    elif (direcao == "Leste"):
        posicao[0] += andar
    elif (direcao == "Oeste"):
        posicao[0] -= andar
    print(f"O {nome} andou")


def mudarPosicao():
    x = int(input("Digite a posição x: "))
    y = int(input("Digite a posição y: "))
    posicao[0] = x
    posicao[1] = y
    print(f"A nova posição é: {posicao}")

def mudarDirecao():
    print("""ESCOLHA A NOVA DIREÇÃO
[0] = Norte
[1] = Sul
[2] = Leste
[3] = Oeste""")
    escolher = int(input("Escolha a opção: "))
    if escolher == 0:
        direcao[0]=["Norte"]
    elif escolher == 1:
        direcao[0]=["Sul"]
    elif escolher == 2:
        direcao[0]=["Leste"]
    elif escolher == 3:
        direcao[0]=["Oeste"]
    else:
        print("OPÇÃO INVALIDA, ESCOLHA UMA OPÇÃO CORRETA")
        mudarDirecao()
    print(f"A nova direção atual é {direcao[0]}")

def retornaPosZero( ):
    posicao = [0,0]
    direcao[0] = "Norte"

# iniciarRobot()
#andarUmPasso()
# andarVariosPasso()
#mudarPosicao()
mudarDirecao()

statusRobot()
