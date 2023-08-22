import threading
import queue
import time

TAMANHO = 10
fila = queue.Queue(TAMANHO)
quantidadeGerada = 500

def produtor():
    i=0
    while i < quantidadeGerada:
        produto = f"produto {i}"
        i+=1
        print(f"O {produto} foi produzido\n")
        fila.put(produto)
        time.sleep(1)

def consumidor():
    while True:
        produto = fila.get()
        if produtor is None:
            break
        print(f"O {produto} foi consumido\n")
        fila.task_done()

def executar():
    produtorTh = threading.Thread(target=produtor)
    consumidorTh = threading.Thread(target=consumidor)
    produtorTh.start()
    consumidorTh.start()

    produtorTh.join()
    consumidorTh.join

    print("Produtos Consumidos")
executar()

