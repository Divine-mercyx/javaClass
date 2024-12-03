
def collect_scores(student_number: int, subject_number: int, students: list):
    if type(student_number) is not int or type(subject_number) is not int:
        raise TypeError("invalid input")
        
    for index in range(student_number):
        scores = []
        count = 0
        print(f"Entering score for student {index + 1}")
        while count < subject_number:
            answer = int(input(f"enter score for subject {count + 1}: "))
            if (answer >= 0 and answer <= 100):
                scores.append(answer)
            else:
                print("invalid number, try again")
                count -= 1
            count += 1
        print()
        students.append(scores)
    display_summary(students)
        
    
def display_summary(students: list):
    position = len(students)
    print("======================================================")
    for index in range(len(students)):
        total = 0
        print(f"student{index + 1}\t", end="")
        for count in range(len(students[index])):
            print(f"{students[index][count]}\t", end="")
            total += students[index][count]
        position -= 1
        print(f"{total}\t{(total / len(students[index])):.1f}\t{position + 1}")
        print()
        
def display_header(students: list):
    
collect_scores(4, 3, [])
