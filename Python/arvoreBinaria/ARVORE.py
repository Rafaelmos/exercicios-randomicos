#Rafael José Moura da Silva
from ArvFuncaoLista import ArvLista

class No():
    def __init__(self, valor):
        self.valor = valor
        self.direita = None
        self.esquerda = None
        self.pai = None
    def __str__(self):
        return f'NO: {self.valor}'

class Arvore():
    def __init__(self):
        self.raiz = None
        self.quantidadeFolhas = 0

    def __addNo(self, no, perc):

        if no.valor>perc.valor:
            if perc.direita==None:
                perc.direita = no
            else:
                self.__addNo(no, perc.direita)
        elif no.valor<perc.valor:
            if perc.esquerda==None:
                perc.esquerda = no
            else:
                self.__addNo( no, perc.esquerda)
        else:
            raise Exception("Valor já existe")

    def add(self, valor):
        no = No(valor)
        if self.raiz == None:
            self.raiz = no
        else:
            self.__addNo(no, self.raiz)
        self.quantidadeFolhas+=1

    def __buscarNo(self, valor, perc):
        if perc == None:
            return None
        if perc.valor == valor:
            return perc
        else:
            if valor > perc.valor:
                return self.__buscarNo(valor, perc.direita)
            else:
                return self.__buscarNo(valor, perc.esquerda)

    def __buscarNoEsq(self, valor, perc):
        if perc == None:
            return None
        if perc.valor == valor:
            return perc
        else:
            if valor < perc.valor:
                return self.__buscarNoEsq(valor, perc.esquerda)
            else:
                print("No não existe ou não é antecessor")

    def __buscarNoDir(self, valor, perc):
        if perc == None:
            return None
        if perc.valor == valor:
            return perc
        else:
            if valor > perc.valor:
                return self.__buscarNoDir(valor, perc.direita)
            else:
                print("No não existe ou não é sucessor")


    def buscar(self, valor):
        if self.quantidadeFolhas == 0:
            return "Valor não existe na árvore"
        busca = self.__buscarNo(valor, self.raiz)
        if busca == None:
            return "Valor não existe na árvore"
        return "Valor encontrado"

    def __imprimir(self, perc):
        if perc != None:
            print(perc)
            self.__imprimir(perc.esquerda)
            self.__imprimir(perc.direita)

    def imprimir(self):
        self.__imprimir(self.raiz)

    def minimo(self, perc):
        while perc.esquerda != None:
            perc = perc.esquerda
        return perc

    def maximo(self, perc):
        while perc.direita != None:
            perc = perc.direita
        return perc

    def sucessor(self, valor):
        if self.quantidadeFolhas == 0:
            return "O nó não tem sucessor da direita"
        busca = self.__buscarNoDir(valor, self.raiz)
        if busca == None:
            return "O nó não tem sucessor da direita"
        print(f" NO: {valor} é sucessor a direta de {self.raiz}")

    def antecessor(self, valor):
        if self.quantidadeFolhas == 0:
            return "O nó não tem antecessor da esquerda"
        busca = self.__buscarNoEsq(valor, self.raiz)
        if busca == None:
            return "O nó não tem antecessor da esquerda"
        print(f" NO: {valor} é antecessor a esquerda de {self.raiz}")


    def remover(self, valor):
        if self.raiz == None:
            raise ValueError("lista Vazia")
        perc = self.raiz
        pai_no = None
        while perc.valor != valor:
            pai_no = perc
            if valor < perc.valor:
                perc = perc.esquerda
            else:
                perc = perc.direita
        if perc.esquerda == None and perc.direita == None:
            if perc == self.raiz:
                self.raiz = None
            else:
                if pai_no.esquerda == perc:
                    pai_no.esquerda = None
                else:
                    pai_no.direita = None
        elif perc.direita == None:
            if perc == self.raiz:
                self.raiz = perc.esquerda
            else:
                if pai_no.esquerda == perc:
                    pai_no.esquerda = perc.esquerda
                else:
                    pai_no.direita = perc.direita
        elif perc.esquerda == None:
            if perc == self.raiz:
                self.raiz = perc.direita
            else:
                if pai_no.direita == perc:
                    pai_no.direita = perc.direita
                else:
                    pai_no.esquerda = perc.esquerda


    def getList(self):
        Lista = list()
        Lista2 = list()
        Lista3 = list()
        def InOrdem(atual):
            if atual != None:
                InOrdem(atual.esquerda)
                Lista.append(atual.valor)
                InOrdem(atual.direita)
        def preOrdem(atual):
            if atual != None:
                Lista2.append(atual.valor)
                preOrdem(atual.esquerda)
                preOrdem(atual.direita)
        def posOrdem(atual):
            if atual != None:
                posOrdem(atual.esquerda)
                posOrdem(atual.direita)
                Lista3.append(atual.valor)
        InOrdem(self.raiz)
        preOrdem(self.raiz)
        posOrdem(self.raiz)
        return f"Lista em InOrdem {Lista}\nLista em preOrdem {Lista2}\nLista em posOrdem {Lista3}"

    def setList(self):
        listaAddArvore = list()
        kif = int(input("Digite a quantidade de elementos da lista: "))
        for c in range(0, kif):
            kof = int(input("Digite o numero para lista: "))
            listaAddArvore.append(kof)
        print(f"A Lista é: {listaAddArvore}")
        esc = int(input("Digite:\n"
                        "1 - Para criar uma nova arvore a partir da lista\n"
                        "2 - Para Adcionar lista a arvore atual: "))
        if esc == 1:
            for i in range(len(listaAddArvore)):
                ArvLista.add(int(listaAddArvore[i]))
            print("A Nova Arvore é:")
            ArvLista.imprimir()
        elif esc == 2:
            for i in range(len(listaAddArvore)):
                arvore.add(int(listaAddArvore[i]))
            print("A lista foi adicionada a arvore:")
            arvore.imprimir()
        else:
            print("Ocorreu um erro, tente novamente")

    def Listaremover(self):
        apagar = list()
        def apagador(atual):
            if atual != None:
                apagador(atual.esquerda)
                apagar.append(atual.valor)
                apagador(atual.direita)
        apagador(self.raiz)
        return apagar

    def menu(self):
        while True:
            print("""                                           \033[1;30mMENU\033[0;0m	
            |[1]  Imprimir Arvore      |  [2]  Buscar      |  [3] Adicionar a Arvore         | 
            |[4]  Maximo               |  [5]  Minimo      |  [6] Quantidade de Nos          |
            |[7]  Sucessor             |  [8]  Antecessor  |  [9] Adicionar lista a Arvore   |
            |[10] Arvore para lista    |  [11] Remover     |  [0] SAIR                       | \n""")
            botao = input("Escolha a Opção: ")
            if botao == "0":
                print("\033[1;31mPrograma Finalizado\033[0;0m	")
                return
            elif botao == "1":
                arvore.imprimir()

            elif botao == "2":
                pp = int((input("Digite o valor a ser procurado: ")))
                print(arvore.buscar(pp))
                # return
            elif botao == "3":
                pp = int((input("Digite o adicionado: ")))
                arvore.add(pp)
                print("Ação realizada")
                # return
            elif botao == "4":
                print(f"O Maximo é: {arvore.maximo(arvore.raiz)}")
                # return
            elif botao == "5":
                print(f"O Mínimo é: {arvore.minimo(arvore.raiz)}")
                # return
            elif botao == "6":
                print("Quantidade de folhas:")
                print(arvore.quantidadeFolhas)
                # return
            elif botao == "7":
                pp = int(input("Digite o nó, para saber de quem ele é sucessor: "))
                arvore.sucessor(pp)
            # return
            elif botao == "8":
                pp = int(input("Digite o nó, para saber de quem ele é antecessor: "))
                arvore.antecessor(pp)
            elif botao == "9":
                arvore.setList()
                # return
            elif botao == "10":
                print(f"A Lista da Arvore é \n{arvore.getList()}")
                # return
            elif botao == "11":
                print(f"Possiveis nós deletaveis: {arvore.Listaremover()}")
                deletar = int(input("Digite o nó que você deseja deletar: "))
                arvore.remover(deletar)
                print("Nó removido")
                arvore.imprimir()
            else:
                print("\033[1;31mBotão Inexistente\033[0;0m	")
                # return


arvore = Arvore()
arvore.add(100)
arvore.add(101)
arvore.add(200)
arvore.add(180)
arvore.add(70)
arvore.add(300)
arvore.add(65)
arvore.add(50)
arvore.menu()



'''Buscar'''
#print(arvore.buscar(700))

'''Quantidade de Nós'''
#print(arvore.quantidadeFolhas)

'''Imprimir'''
#arvore.imprimir()
#print ("----------------------")
'''Minimo'''
#print(f"Minimo: {arvore.minimo(arvore.raiz)}")

'''Maximo'''
#print(f"Maximo: {arvore.maximo(arvore.raiz)}")

"""Sucessor"""
#arvore.sucessor(101)

"""Antecessor"""
#arvore.antecessor(70)


'''Adicionar lista a Arvore'''
#arvore.setList()

'''Transformar arvore em Lista'''
#print(arvore.getList())

'''Remover'''

#arvore.remover()
#arvore.imprimir()