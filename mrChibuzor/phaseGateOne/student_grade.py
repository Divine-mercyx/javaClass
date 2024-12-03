
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
    display_header(students)
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
    subject_summary(students)
        
def display_header(students: list):
    print("Students\t", end="")
    for index in range(len(students[0])):
        print(f"sub{index + 1}\t", end="")
    print("TOT\tAVE\tPOS")
    
    
def subject_summary(students):
    print("Subject summary")
    for index in range(len(students[0])):
        decideForEachSubject(index, students)
        
def decideForEachSubject(row, students):
    largest = students[0][0]
    smallest = students[0][0]
    largestIndex = 0
    smallestIndex = 0
    total = 0
    for index in range(len(students)):
        if students[index][row] > largest:
            largest = students[index][row]
            largestIndex = row
        elif students[index][row] < smallest:
            smallest = students[index][row]
            smallestIndex = row
        total += students[index][row]
    print(f"subject {row + 1}")
    print(f"highest scoring is: student {largestIndex + 1} scoring {largest}\nLowest scoring is: student {smallestIndex + 1} scoring {smallest}\nTotal score: {total}\nAverage score: {(total/len(students)):.2f}")
    value = number_of_passes(row, students)
    print(f"Number of passes: {value[0]}\nNumber of fails: {value[1]}")
    print()
    
def number_of_passes(row, students):
    passes = 0
    fail = 0
    subject = row
    for index in range(len(students)):
        if students[index][row] >= 50:
            passes += 1
        else: fail += 1
    value = [passes, fail, subject]
    return value

collect_scores(4, 2, [])

