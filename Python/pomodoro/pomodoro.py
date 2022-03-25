import time

def work(seconds):
    print ("já")
    time.sleep(seconds)
    return print("Acabou, hora de descançar")

def relax(seconds):
    time.sleep(seconds)
    return print("Acabou, hora de estudar")

work() #Usar para setar o tempo de estudo
relax() #Usar para setar o tempo de descanço




