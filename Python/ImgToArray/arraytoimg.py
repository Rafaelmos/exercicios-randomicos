import cv2
import numpy as np

def carregar_matriz_de_txt(nome_do_arquivo, shape_original):
    # Carregar a matriz do arquivo de texto
    matriz_carregada = np.loadtxt(nome_do_arquivo, delimiter=',')
    
    # Se a matriz original era 3D, remodelar para a forma original
    if len(shape_original) == 3:
        altura, largura, canais = shape_original
        matriz_carregada = matriz_carregada.reshape((altura, largura, canais))
    
    return matriz_carregada


def array_para_imagem(array):
    imagem_n = cv2.normalize(array, None, 0, 255, cv2.NORM_MINMAX, dtype=cv2.CV_8U)
    #imagem = cv2.cvtColor(imagem_n, cv2.COLOR_GRAY2BGR)  # Se o array for em escala de cinza
    imagem = np.uint8(array)
    return imagem

#nome_do_arquivo = "C:\\Users\\rafae\\Desktop\\abc\\array_da_imagem.txt"
#shape_original = (1080, 1080, 3)
#array_carregado = carregar_matriz_de_txt(nome_do_arquivo, shape_original)
#imagem = array_para_imagem(array_carregado) 

def create_img(nome, formato, imagem):
    cv2.imwrite(f"{nome}.{formato}", imagem) 
    
    