def check_sum_two_values(list_any):
  number_checker = int(input("Digite o número a ser checado: "))
  try:
      for i in range(len(list_any)): 
        index = i + 1
        while(len(list_any) > index):
          if(list_any[i] + list_any[index] == number_checker):
            return True
          index += 1
  except NameError:
        print("Crie uma lista de números inteiros com a variavel chamada de 'list_any' ")
  return False
  
list_any = [2, 3, 4, 5, 1]
print(check_sum_two_values(list_any))
