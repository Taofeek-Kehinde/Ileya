input_numbers = [1, 2, 3, 2, 4, 3]

numbers_that_appear_more_than_once = []

for index in range(len(input_numbers)):
    for next_index in range(index + 1, len(input_numbers)):
        current_number = input_numbers[index]
        if current_number == input_numbers[next_index] and current_number not in numbers_that_appear_more_than_once:
            numbers_that_appear_more_than_once.append(current_number)

print(numbers_that_appear_more_than_once)
