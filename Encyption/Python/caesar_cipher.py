message = input("Enter a message: ")
shift_amount = int(input("How many letters should we shift? "))

encrypted_message = ""

for letter in message:
    if letter.isalpha(): # checking if a character is a letter (a–z or it is A–Z) 
        new_letter = chr(ord(letter) + shift_amount) # conver letter to number using ord e.g h → 104 → 107 → k
        encrypted_message += new_letter
    else:
        encrypted_message += letter

print("Encrypted message:", encrypted_message)
