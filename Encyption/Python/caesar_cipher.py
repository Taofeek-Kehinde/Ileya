for letter in message:
    if letter.isalpha():
        number_version = ord(letter)           # Step 1: 'h' = 104
        shifted_number = number_version + shift_amount  # Step 2: 104 = 107
        new_letter = chr(shifted_number)       # Step 3: 107 = 'k'
        encrypted_message += new_letter
    else:
        encrypted_message += letter

print("Encrypted message:", encrypted_message)
