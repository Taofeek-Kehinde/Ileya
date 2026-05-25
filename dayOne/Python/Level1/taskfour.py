def is_perfect_square(number):
    current = 0
    while current * current < number:
        current +=1
    return current * current == number

def replace_none_squares(numbers):
    return[new_number if is_perfect_square(new_number)
else -1 for new_number in numbers]

print(replace_none_squares([4, 7, 9, 10, 49, 6]))
