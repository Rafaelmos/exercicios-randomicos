from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.backends import default_backend
import numpy as np
import arraytoimg, imgtoarray
import os
import pickle

def criptografar(matriz, chave):
    # Converter a matriz em bytes
    dados = matriz.tobytes()
    
    # Criar um objeto de cifra AES
    cifra = Cipher(algorithms.AES(chave), modes.ECB(), backend=default_backend())
    cifrador = cifra.encryptor()
    
    # Criptografar os dados
    dados_criptografados = cifrador.update(dados) + cifrador.finalize()
    
    return dados_criptografados

def descriptografar(dados_criptografados, chave, forma):
    # Criar um objeto de cifra AES
    cifra = Cipher(algorithms.AES(chave), modes.ECB(), backend=default_backend())
    decifrador = cifra.decryptor()
    
    # Descriptografar os dados
    dados = decifrador.update(dados_criptografados) + decifrador.finalize()
    
    # Reconstruir a matriz a partir dos bytes descriptografados
    matriz = np.frombuffer(dados, dtype=np.uint8).reshape(forma)
    
    return matriz

def salvar_lista(lista, nome_do_arquivo):
    with open(nome_do_arquivo, 'wb') as f:
        pickle.dump(lista, f)
        print("Ok")

def carregar_lista(nome_do_arquivo):
    with open(nome_do_arquivo, 'rb') as f:
        lista_carregada = pickle.load(f)
    return lista_carregada

matriz_original = imgtoarray.imagem_para_array("C:\\Users\\rafae\\Desktop\\abc\\salve.jpg")
#print("Matriz original:")
#print(matriz_original)

# Chave de criptografia (deve ter 16, 24 ou 32 bytes para o AES)
#chave = os.urandom(16)
chave = b"a"
print(chave)
# Criptografar a matriz
dados_criptografados = criptografar(matriz_original, chave)
#print("\nDados criptografados:")
#print(dados_criptografados)

# Descriptografar os dados
#matriz_descriptografada = descriptografar(dados_criptografados, chave, matriz_original.shape)
#print("\nMatriz descriptografada:")
#print(matriz_descriptografada)

# Exemplo de uso
#nome_do_arquivo = "C:\\Users\\rafae\\Desktop\\abc\\dados_criptografados.txt"
salvar_lista(dados_criptografados, "dados_criptografados.txt")
#lista_carregada = carregar_lista(nome_do_arquivo)


#matriz_descriptografada = descriptografar(lista_carregada, chave, matriz_original.shape)

#imagem = arraytoimg.array_para_imagem(matriz_descriptografada)
#arraytoimg.create_img("imagem", "png", imagem)