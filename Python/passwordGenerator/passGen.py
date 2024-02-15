import random
import string

def word_to_number(word):
    if word is float:
        word = f"{word}"
    if word is str:
        total = 0
        for char in word:
            total += ord(char)
        return total
    else:
        return int(word)

def generate_password(seed, length):
    random.seed(seed)
    characters = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(random.choice(characters) for _ in range(length))
    return password

seed = input("Digite uma Seed:")
length = int(input("Digite um número"))

password = generate_password(seed, length)
print("Senha gerada:", password)

