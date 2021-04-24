""###################################################################    
'''Questão 1
1
2 2
3 3 3
'''
def escadaria():    
    for i in range(contador+1):
        k=((" "+str(i)) * i)
        print (k)
    return k
contador = int(input("Digite o num de degraus: "))
escadaria()
####################################################################    ""
'''Questão 2
1
1 2
1 2 3
'''
def escadanum():
    st = ''
    for i in range(0, contador2):
        i += 1
        st += " " + str(i)
        print(st)
    return st
contador2 = int(input("Digite o num de degraus: "))
escadanum()
####################################################################    ""
'''Questão 3 - SOMA DE ARGUMENTOS'''
def somaarg (arg1,arg2,arg3):
    argfinal = (arg1+arg2+arg3)
    print(argfinal)
    return argfinal
arg1 = float(input("Argumento1: "))
arg2 = float(input("Argumento2: "))
arg3 = float(input("Argumento3: "))
somaarg(arg1,arg2,arg3)
####################################################################    ""       
'''
IMPRIMIR UM NOME + comprimento
'''
def bomdia(nome): 
    cumprimento = (f"Bom dia {nome}")
    print(cumprimento)
    return cumprimento
nome = (input("Diga seu nome: "))
bomdia(nome)
####################################################################    ""
'''Questão 4'''
def veracidade(test):
    a = int(test)
    if a > 0:
        print('P')
    else:
        print('N')
    return
test = input("Digite um numero: ")
veracidade(test)

####################################################################    ""
'''Questão 5'''
def reversor (inverter):   
    a = str(inverter)
    b = (a[::-1])
    print(b)
    return b
inverter = int(input("DIGITE: "))
reversor(inverter)
####################################################################    ""
'''Questão 6
'''
def cont_algarismo(cont):
    str_algarismo = str(cont)
    leitor_de_numeros = len(str_algarismo)
    print(leitor_de_numeros)
    return (leitor_de_numeros)
cont = int(input("Digite um número: "))
cont_algarismo(cont)
####################################################################    ""
'''Questão 7'''
####################################################################    ""
'''Questão 7.1'''
def calendario(dia,mes,ano):
    ListaDeMeses = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio',
'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro']
    if dia >= 31:
        print("NULL")
    elif mes <= 12:
        mesPorExtenso = ListaDeMeses[mes-1]
        print (f' Dia {dia} de {mesPorExtenso} de {ano}')
    else:
        print("NULL")
    
    return
dia = int(input('Digite o Dia: '))
mes = int(input('Digite o Mes: '))
ano = int(input('Digite o Ano: '))
calendario(dia,mes,ano)
####################################################################    """
'''Questão 8'''


