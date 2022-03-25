import time
import pygame
import os


working = float(input("Digite o tempo de estudo/trabalho: "))
relaxing = float(input("Digite o tempo de descanço: "))

def work (minutes):
    seconds = minutes * 60
    time.sleep(seconds)
    alarm()
    print("Acabou, hora de descançar")  
    return relax(relaxing) #Usar para setar o tempo de descanço

def relax(minutes):
    seconds = minutes * 60
    time.sleep(seconds)
    alarm()
    return print("Acabou, hora de estudar")

def alarm():
    pygame.mixer.init()
    pygame.init()
    sourceFileDir = os.path.dirname(os.path.abspath(__file__))
    filePath = os.path.join(sourceFileDir, 'alarmclock.mp3')
    pygame.mixer.music.load(filePath)
    pygame.mixer.music.play()
    pygame.event.wait()
    return

work(working) #Usar para setar o tempo de estudo








