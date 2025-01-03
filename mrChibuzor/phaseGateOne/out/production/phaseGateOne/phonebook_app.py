def display_menu():
    menu = """
    1. Add contact
    2. Remove contact
    3. Find contact by phone number
    4. Find contact by Firstname
    5. Find contact by Lastname
    6. Edit contact
    """
    return menu


def get_question_options():
    menu = display_menu()
    print(menu)
    option = int(input("> "))
    match option:
        case 1: add_contacts()
        case 2: remove_contact()
        case 3: find_contact_by_number()
        case 4: find_contact_by_first_name()
        case 5: find_contact_by_last_name()
        case 6: edit_contact()


def add_contacts():
    first_name = input("enter first name: ")
    last_name = input("enter last name: ")
    address = input("enter address: ")
    phone_number = input("enter number: ")
    email = input("enter email: ")
    if first_name in usernames or last_name in last_names:
        print("name already exists")
        create_space()
        get_question_options()
        
    usernames.append(first_name)
    last_names.append(last_name)
    addresses.append(address)
    numbers.append(phone_number)
    emails.append(email)
    create_space()
    get_question_options()
    
    
def remove_contact():
    name = input("enter name of contact to remove: ")
    if name in usernames:
        index = usernames.index(name)
        usernames.pop(index)
        last_names.pop(index)
        addresses.pop(index)
        numbers.pop(index)
        emails.pop(index)
        print("contact deleted...")
        create_space()
        get_question_options()
    else: 
        print("name not in contact, try again")
        remove_contact()
        create_space()
        
    
def find_contact_by_number():
    number = input("enter the number: ")
    if number in numbers:
        index = numbers.index(number)
        print(f"first name: {usernames[index]}\nlast name: {last_names[index]}\naddress: {addresses[index]}\nnumber: {numbers[index]}\nemail: {emails[index]}")
        create_space()
        get_question_options()
    else:
        print("number does not exist")
        create_space()
        get_question_options()
        
        
        
def find_contact_by_first_name():
    name = input("enter name: ")
    if name in usernames:
        index = usernames.index(name)
        print(f"first name: {usernames[index]}\nlast name: {last_names[index]}\naddress: {addresses[index]}\nnumber: {numbers[index]}\nemail: {emails[index]}")
        create_space()
        get_question_options()
    else:
        print("name does not exist")
        create_space()
        get_question_options()
    
    
def find_contact_by_last_name():
    name = input("enter last name: ")
    if name in last_names:
        index = last_names.index(name)
        print(f"first name: {usernames[index]}\nlast name: {last_names[index]}\naddress: {addresses[index]}\nnumber: {numbers[index]}\nemail: {emails[index]}")
        create_space()
        get_question_options()
    else:
        print("last name does not exist")
        create_space()
        get_question_options()
        
        
        
def edit_contact():
    name = input("enter name: ")
    if name in usernames:
        index = usernames.index(name)
        new_name = input("change name")
        usernames[index] = new_name
        new_last_name = input("change last name: ")
        last_names[index] = new_last_name
        address = input("change address: ")
        addresses[index] = address
        number = input("change number: ")
        numbers[index] = number
        email = input("change email: ")
        emails[index] = email
        create_space()
        get_question_options()




def create_space():
    print()

usernames = []
last_names = []
addresses = []
numbers = []
emails = []
get_question_options()
