total_list_numbers = [45, 60, 3, 10, 9, 22]

odd_numbers = [for_each_item for for_each_item in total_list_numbers if for_each_item % 2 !=0]
even_numbers = [for_each_item for for_each_item in total_list_numbers if for_each_item % 2 ==0]

result = [odd_numbers, even_numbers]

print(result)

