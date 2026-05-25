def is_perfect_square(number):
    current = 0
    while current * current < number:
        current +=1
    return current * current == number

list_numbers = [4,7,9,10,16,18]
perfect_squares = [new_number for new_number in list_numbers if is_perfect_square(new_number)]

print(perfect_squares)
