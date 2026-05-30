print("Welcome to Credit Card Validator!")
print("Enter your credit card number (numbers only):")
card_number = input("Enter your card number: ")


clean_number = ""
for character in card_number:
    if character != " ":
        clean_number = clean_number + character

length = len(clean_number)
print("Your card has", length, "digits")


first_digit = clean_number[0]

if length >= 2:
    first_two = clean_number[0] + clean_number[1]
else:
    first_two = ""

if first_digit == "4":
    card_type = "Visa"
elif first_digit == "5":
    card_type = "MasterCard"
elif first_two == "37":
    card_type = "American Express"
elif first_digit == "6":
    card_type = "Discover"
else:
    card_type = "Unknown"

print("Card type:", card_type)


sum_of_doubled = 0  
sum_of_odd_positions = 0  


position_from_right = 1 

for i in range(length - 1, -1, -1):   
    current_digit = int(clean_number[i])  
    
    
    if position_from_right % 2 == 0: 
        doubled = current_digit * 2
        
        if doubled >= 10:
            tens = doubled // 10 
            ones = doubled % 10    
            sum_of_doubled = sum_of_doubled + tens + ones
        else:
            sum_of_doubled = sum_of_doubled + doubled
    else:  
        sum_of_odd_positions = sum_of_odd_positions + current_digit
    
    position_from_right = position_from_right + 1

print("sum of all doubled digits : ", sum_of_doubled)
print("sum of odd position digits : ", sum_of_odd_positions)

total_sum = sum_of_doubled + sum_of_odd_positions
print("Total sum:", total_sum)

if total_sum % 10 == 0:
    print("\n 😍️ VALID! This credit card number is valid!")
    validity = "Valid"
else:
    print("\n😡️ INVALID! This credit card number is NOT valid!")
    validity = "Invalid"

print("\n" + "="*50)
print("CREDIT CARD VALIDATION RESULT")
print("="*50)
print("Card number:", clean_number)
print("Length:", length, "digits")
print("Card type:", card_type)
print("Validity:", validity)
print("="*50)

