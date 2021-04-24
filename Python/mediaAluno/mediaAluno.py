#FUNÇÃO PARA TESTAR ALUNO
def TesteAlunos ():
    AlunoA = dict()
    AlunoA['Nome'] = str(input('Digite o nome do aluno: '))
    AlunoA['Nota1'] = float(input('Digite a nota 1: '))
    Nota1= float(AlunoA['Nota1'])
    AlunoA['Nota2'] = float(input('Digite a nota 2: '))
    Nota2= float(AlunoA['Nota2'])
    AlunoA['Nota3'] = float(input('Digite a nota 3: '))
    Nota3= float(AlunoA['Nota3'])
    #ATT: ESSA AREA É ONDE O PROGRAMA LER A NOTA 1 ATÉ A NOTA 3 E AVALIA QUAL É A MELHOR NOTA PARA SE COLOCAR NA MEDIA
    if Nota1 < Nota2 and Nota1 < Nota3 or (Nota2==Nota3 and Nota2 > Nota1):
        mediafuncao = (Nota2+Nota3)/2
        AlunoA['Media']= mediafuncao
    elif Nota1 == Nota2 and Nota2==3:
        mediafuncao = (Nota1+Nota2+Nota3)/3
        AlunoA['Media']= mediafuncao
    elif Nota2 < Nota1 and Nota2 < Nota3 or (Nota1==Nota3 and Nota1 > Nota2):
        mediafuncao = (Nota1+Nota3)/2
        AlunoA['Media']= mediafuncao
    elif Nota3 < Nota2 and Nota3 < Nota1 or (Nota1==Nota2 and Nota1 > Nota3):
        mediafuncao = (Nota1+Nota2)/2
        AlunoA['Media']= mediafuncao
#VARIAVEIS NECESSSARIAS PARA O TESTE DEFINITIO
    media = float(AlunoA['Media'])
    nome = str(AlunoA['Nome'])
    if Nota1>10 or Nota2>10 or Nota3>10:
        print('Nota impossivel')
    else:
#LOCAL ONDE MOSTRA-SE OS DADOS DO ALUNO
            for k,v in AlunoA.items():
                print(f' {k}: {v}')
        #RESULTADO DEFINITIVO DO TESTE DE ALUNOS
            for i in AlunoA.items():   
                print(f"O Aluno se chama {nome}")
                print(f"Sua Média é igual a {media}")
                break
            if media < 3 and media >= 0:
                print(f'O Aluno {nome} está reprovado')
            elif media > 3 and media < 7:
                print(f'O Aluno {nome} precsa fazer a prova final')
            elif media >= 7 and media <= 10:
                print(f'{nome} está aprovado')
            else:
                print(f'não foi possivel avaliar a nota de {nome}')
            return

opcao = ""
cL = 50 #constanteLinha
print("_"*cL)
print("Seja Bem-vindo ao Programa")
#conveção de opção para saída = "s"
while (opcao != "s") :
    print("_"*cL)
#LOCAL ONDE SE CONFIGURA O MENU PRINCIPAL!
    print((23*"-")+"MENU"+(23*"-"))
    print("Escolha sua opção para continuar")
    print("a - Testar Aprovação do Aluno")
    print("b -")
    print("s - ENCERRAR")
    opcao = input("Digite sua opção:")
#LOCAL ONDE SE TESTA A APROVAÇÃO DO ALUNO
    if (opcao == "a" or opcao == "A"):
        TesteAlunos()
    elif(opcao== "s" or opcao == "S"):
        print("Programa Encerrado")
















