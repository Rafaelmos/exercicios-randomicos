def escadaria():
    c = int(input("Digite o num de degraus: "))
    for i in range(c+1):
        k=((" "+str(i)) * i)
        print (k)
    return k
escadaria()

