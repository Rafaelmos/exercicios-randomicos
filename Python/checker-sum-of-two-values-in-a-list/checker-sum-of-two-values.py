def check_sum_two_values():
    try:
        number_checker = int(input("Digite o número a ser checado: "))
        scan_result = False
        while len(list_any) != 0 and scan_result == False:
            index = 0
            while index != len(list_any) and scan_result == False:
                current_value = list_any[index]
                last_value = list_any[-1]
                number_verified = current_value+last_value
                index = index + 1
                if number_verified == number_checker:
                    scan_result = True
                    del(list_any[:])
                else:
                    scan_result = False
            if len(list_any) == 0:
                scan_result = True
            else:
                del(list_any[-1])
        print(scan_result)
    except NameError:
        print("Crie uma lista de números inteiros com a variavel chamada de 'list_any' ")


list_any = [2, 3, 4, 5, 1]
check_sum_two_values()
