
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
        students.append(scores)
        print()
        
    

students = []
collect_scores(4, 2, students)
