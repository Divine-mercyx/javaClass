def get_students_marks(number):
    python_list = []
    java_list = []
    design_list = []
    data_list = []
    username_list = []
    if type(number) is not int:
        raise TypeError("not integer")
        
    elif type(number) is int:
        for _ in range(number):
            username = input("enter the name: ")
            username_list.append(username)
            
            python = int(input("enter score for python: "))
            python_list.append(python)
            
            java = int(input("enter score for java: "))
            java_list.append(java)
            
            design_thinking = int(input("enter score for design thinking: "))
            design_list.append(design_thinking)
            
            data_science = int(input("enter score for data science: "))
            data_list.append(data_science)
            print()
            
        python_highest = python_list[0]
        python_lowest = python_list[0]
        
        for number in python_list:
            if number > python_highest:
                python_highest = number
            elif number < python_lowest:
                python_lowest = number
        
        
        
        java_highest = java_list[0]
        java_lowest = java_list[0]
        
        for number in java_list:
            if number > java_highest:
                java_highest = number
            elif number < java_lowest:
                java_lowest = number
                
                
                
        design_highest = design_list[0]
        design_lowest = python_list[0]
        
        for number in design_list:
            if number > design_highest:
                design_highest = number
            elif number < design_lowest:
                design_lowest = number
        
        
        
        data_highest = data_list[0]
        data_lowest = data_list[0]
        
        for number in data_list:
            if number > data_highest:
                data_highest = number
            elif number < data_lowest:
                data_lowest = number
                
                
        print("student\t\tpython\tjava\tDT\tdata s")
        print()
        for index in range(len(username_list)):
            print(f"{username_list[index]}:\t\t{python_list[index]}\t{java_list[index]}\t{design_list[index]}\t{data_list[index]}\n")
        
        
        print()
        print("python")
        for count in range(len(python_list)):
            if python_list[count] == python_highest:
                print(f"the highest student in python is {username_list[count]} scoring {python_highest}")
                
                
        
        for count in range(len(python_list)):
            if python_list[count] == python_lowest:
                print(f"the lowest student in python is {username_list[count]} scoring {python_lowest}")
                
                
        
        print()
        print("java")
        for count in range(len(java_list)):
            if java_list[count] == java_highest:
                print(f"the highest student in java is {username_list[count]} scoring {java_highest}")
                
                
        
        for count in range(len(java_list)):
            if java_list[count] == java_lowest:
                print(f"the lowest student in java is {username_list[count]} scoring {java_lowest}")
                
                
                
        
        
        
        
        print()
        print("design thinking")
        for count in range(len(design_list)):
            if design_list[count] == design_highest:
                print(f"the highest student in design thinking is {username_list[count]} scoring {design_highest}")
                
                
        
        for count in range(len(design_list)):
            if design_list[count] == design_lowest:
                print(f"the lowest student in design thinking is {username_list[count]} scoring {design_lowest}")
                
                
        
        print()
        print("Data science")
        for count in range(len(data_list)):
            if data_list[count] == data_highest:
                print(f"the highest student in data science is {username_list[count]} scoring {data_highest}")
                
                
        
        for count in range(len(data_list)):
            if data_list[count] == data_lowest:
                print(f"the lowest student in data science is {username_list[count]} scoring {data_lowest}")
    

get_students_marks(3)
