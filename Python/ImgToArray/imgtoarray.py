import cv2
import numpy as np

def imagem_para_array(caminho_da_imagem):
    # Carregar a imagem usando OpenCV
    imagem = cv2.imread(caminho_da_imagem)
    
    # Verificar se a imagem foi carregada corretamente
    if imagem is None:
        raise FileNotFoundError(f"Não foi possível carregar a imagem em {caminho_da_imagem}")   
    #imagem = cv2.cvtColor(imagem, cv2.COLOR_BGR2GRAY)
    # Converter a imagem para um array NumPy
    array_da_imagem = np.asarray(imagem)    
    return array_da_imagem


def salvar_matriz_em_txt(matriz, nome_do_arquivo):
    # Remodelar a matriz 3D para 2D se necessário
    if matriz.ndim == 3:
        altura, largura, canais = matriz.shape
        matriz = matriz.reshape((altura * largura, canais))
    
    # Salvar a matriz em um arquivo de texto
    np.savetxt(nome_do_arquivo, matriz, delimiter=',')
    
# Exemplo de uso
#img = "imagem.webp"
#caminho_da_imagem = f"C:\\Users\\rafae\\Desktop\\abc\\{img}"
#array_da_imagem = imagem_para_array(caminho_da_imagem)
#print(array_da_imagem.shape)

#nome_do_arquivo = "array_da_imagem.txt"
#salvar_matriz_em_txt(array_da_imagem, nome_do_arquivo)






