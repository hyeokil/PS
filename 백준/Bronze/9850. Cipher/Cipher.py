def decrypt_caesar_cipher(ciphertext, shift):
    plaintext = []
    for char in ciphertext:
        if 'A' <= char <= 'Z':
            new_char = chr(((ord(char) - ord('A') - shift) % 26) + ord('A'))
            plaintext.append(new_char)
        else:
            plaintext.append(char)
    return ''.join(plaintext)

def find_decryption(ciphertext):
    for shift in range(1, 26):
        decrypted_message = decrypt_caesar_cipher(ciphertext, shift)
        if "CHIPMUNKS" in decrypted_message and "LIVE" in decrypted_message:
            return decrypted_message
    return 


ciphertext = input()
plaintext = find_decryption(ciphertext)
print(plaintext)
