def card_validator(number: int):
    if type(number) is not int:
        raise TypeError("not int")
        
    card_length_validator = True
    odd_places_sum = 0
    second_digit_sum = 0
    number = str(number)
    card_type = "invalid"
    validity_status = "invalid"
    if len(str(number)) > 16 or len(str(number)) < 13:
        card_length_validator = False
    for index in range(len(str(number)) - 1, 0, -2):
        odd_places_sum += int(number[index])
    
    for index in range(len(str(number)) - 2, -2, -2):
        product = 2 * int(number[index])
        multiple = 0
        if len(str(product)) == 2:
            product = str(product)
            for count in range(len(str(product))):
                multiple += int(product[count])
                if count == 1:
                    product = multiple
                
        second_digit_sum += product
    total_sum = second_digit_sum + odd_places_sum
    value_list = decide_type_of_card(number, total_sum, card_type, validity_status)
    return value_list

def decide_type_of_card(number: str, total_sum: int, card_type: str, validity_status: True):
    if total_sum % 10 == 0:
        validity_status = "Valid"
        if "4" == number[0]:
            card_type = "Visa card"
        elif "5" == number[0]:
            card_type = "Master card"
        elif "37" == number[0:2]:
            card_type = "American express"
        elif "6" == number[0]:
            card_type = "Discover card"
    else:
        validity_status = "Invalid"
        card_type = "Invalid"
    return [card_type, validity_status, number]


def give_output(number):
    values = card_validator(number)
    print("********************************************")
    print("**Credit card type: " + values[0] + "\n**Credit card number: " + values[2] + "\n**Credit card digit length: " + str(len(values[2])) + "\n**Credit card validator status: " + values[1])
    print("********************************************")


give_output(5399831619690403)
