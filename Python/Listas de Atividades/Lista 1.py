print ("Questão 2")
a= int(input('Digite o um numero inteiro: '))
b= int(input('Digite o outro numero inteiro: '))
print (f"O primeiro número é {a} o segundo número é {b}")



print ("Questão 3")
n = int(input('Digite um número aleatorio: '))
print (f"O numero é {n}, seu sucessor é {n+1} e seu antecessor é {n-1}")


print ("Questão 4")
n1 = int(input('Digite um número: '))
n2 = int(input('Digite um número: '))
print (f"Os númeoros são {n1} e {n2} e sua soma é {n1+n2}")

print ("Questão 5")
n1 = int(input('Digite um número: '))
n2 = int(input('Digite um número: '))
print (f"Os númeoros são {n1} e {n2} e sua diferença é {n1-n2} ou {n2-n1}")

print ("Questão 6")
n1 = int(input('Digite um número: '))
n2 = int(input('Digite um número: '))
print (f"Os númeoros são {n1} e {n2} e sua multiplicação é {n1*n2}")


print ("Questão 7")
valor= int(input('Digite o valor gasto: '))
gorjeta = valor/10
valortotal = gorjeta + valor
print (f"O valor da gorjeta é {gorjeta}, o valor da despesa é {valor} e o valor total é {valortotal}")


print ("Questão 8")
salariomin = 998
salarioreal = int(input("Digite o valor do salário: "))
numerodesalarios = (salarioreal/salariomin)
print (f"Essa pessoa recebe {numerodesalarios} salários minimos")

print ("Questão 9")
n1 = 7
n2 = 8
n3 = 9
n4 = (n1+n2+n3)
n5 = n4/3
print (f"A média de {n1}+{n2}+{n3} é", int(n5))


print ("Questão 10")
n1 = int(input('Digite um número A: '))
n2 = int(input('Digite um número B: '))
n3 = int(input('Digite um número C: '))
n4 = int(input('Digite um número D: '))
n5 = int((n1+n2+n3+n4)/4)
print (f"A média dos números {n1}, {n2}, {n3}, {n4} é {n5}")



print ("Questão 11")
n1 = int(input('Digite um número A: '))
n2 = int(input('Digite um número B: '))
n3 = int(input('Digite um número C: '))
n4 = int(input('Digite um número D: '))
n5 = int((1*n1+2*n2+3*n3+4*n4)/(1+2+3+4))
print (f"A média ponderada dos números {n1}, {n2}, {n3}, {n4} é {n5}")



print ("Questão 12")
saldo= int(input("Digite seu saldo: "))
juros= saldo/40
novosaldo = saldo + juros
print (f"O juros de renda são {juros} e o novo saldo é {novosaldo}")


print ("Questão 13")
base = int (input("Digite a base:"))
altura = int(input("Digite a altura:"))
perimetro , area = ((base*2+altura*2)) , (base*altura)
print ("seu perimetro é", perimetro, "e sua area é", area)
print ("")


print ("Questão 14")
baset = int(input('Digite a base do triângulo'))
altt = int(input('Digite a altura do triângulo'))
areat = (baset*altt)/2