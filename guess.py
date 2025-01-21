import random
import os

#os.system("shutdown now")
count = 1
sum_fail_list = []
sum_win_count = 0
sum_fail_count = 0

sum_fail_list_product = []
sum_win_count_product = 0
sum_fail_count_product = 0

sum_fail_list_subtract = []
sum_win_count_subtract = 0
sum_fail_count_subtract = 0



while count <= 1:
    for _ in range(5):
        print("ADDITION")
        first_number = random.randint(1, 1000)
        second_number = random.randint(1, 1000)
        real_answer = first_number + second_number
        print(f"{first_number} + {second_number} is ")
        answer = int(input(">>> "))
        if type(answer) is not int:
            print("not integer")
        if answer == real_answer:
            sum_win_count += 1
            print("you got it")
        else:
            sum_fail_count += 1
            print("nah, its wrong")
            sum_fail_list.append(real_answer)
            
    os.system("clear")
            
            
    for _ in range(3):
        print("MULTIPLICATION")
        first_number = random.randint(1, 1000)
        second_number = random.randint(1, 1000)
        real_answer = first_number * second_number
        print(f"{first_number} * {second_number} is ")
        answer = int(input(">>> "))
        if type(answer) is not int:
            print("not integer")
        if answer == real_answer:
            sum_win_count_product += 1
            print("you got it")
        else:
            sum_fail_count_product += 1
            print("nah, its wrong")
            sum_fail_list_product.append(real_answer)
            
    os.system("clear")
            
            
            
    for _ in range(2):
        print("SUBSTRACTION")
        first_number = random.randint(1, 1000)
        second_number = random.randint(1, 1000)
        real_answer = first_number - second_number
        print(f"{first_number} - {second_number} is ")
        answer = int(input(">>> "))
        if type(answer) is not int:
            print("not integer")
        if answer == real_answer:
            sum_win_count_subtract += 1
            print("you got it")
        else:
            sum_fail_count_subtract += 1
            print("nah, its wrong")
            sum_fail_list_subtract.append(real_answer)
            
    os.system("clear")
            
            
    count += 1


print("ADDTION")
print(f"you got {sum_win_count} and lose {sum_fail_count}\nWhat you got wrong")
for i in sum_fail_list:
    print(i)
print()
    
print("MULTIPLICATION")
print(f"you got {sum_win_count_product} and lose {sum_fail_count_product}\nWhat you got wrong")
for i in sum_fail_list_product:
    print(i)
print()
    
print("SUBTRACTION")
print(f"you got {sum_win_count_subtract} and lose {sum_fail_count_subtract}\nWhat you got wrong")
for i in sum_fail_list_subtract:
    print(i)
