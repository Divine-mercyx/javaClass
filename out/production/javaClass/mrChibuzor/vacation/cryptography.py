def encrypt(message: str, key: int):
    encrypted = ""
    for letter in message:
        if letter == " ":
            encrypted += "#"
        elif letter == letter.lower() and letter != " ":
            index = alphabets.index(letter)
            number = index + key
            encrypted += alphabets[number]
        
        elif letter == letter.upper():
            index = alphabets2.index(letter)
            number = index + key
            encrypted += alphabets2[number]
    return encrypted
    
    
def decrypt(encrypted, key):
    decrypted = ""
    for letter in encrypted:
        if letter == "#":
            decrypted += " "
            
        elif letter == letter.lower() and letter != " ":
            index = alphabets.index(letter)
            number = index - key
            decrypted += alphabets[number]
        
        elif letter == letter.upper():
            index = alphabets2.index(letter)
            number = index - key
            decrypted += alphabets2[number]
            
    return decrypted


message = input("enter the message to encrypt: ")
key = int(input("enter the key: "))


alphabets = "abcdefghijklmnopqrstuvwxyz"
alphabets2 = "ABCDEFIJKLMNOPQRSTUVWXYZ"


