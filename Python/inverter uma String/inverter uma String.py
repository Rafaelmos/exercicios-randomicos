def reversoflash (inverter):
   
    a = str(inverter)
    b = (a[::-1])
    print (str(b))
    return b
inverter = int(input("DIGITE: "))
reversoflash(inverter)
