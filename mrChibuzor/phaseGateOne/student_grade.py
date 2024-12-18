
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
        position = get_position(index, students)
        print(f"{total}\t{(total / len(students[index])):.1f}\t{position:>3}")
        print()
    subject_summary(students)
    
    
def get_total(row: int, students: list):
    total = 0
    for index in range(len(students[row])):
        total += students[row][index]
    return total
    
    
def get_position(row: list, students: list):
    student = get_total(row, students)
    position = 1
    for index in range(len(students)):
        other_students = get_total(index, students)
        if index != row and student < other_students:
            position += 1
    return position
        
def display_header(students: list):
    print("Students\t", end="")
    for index in range(len(students[0])):
        print(f"sub{index + 1}\t", end="")
    print("TOT\tAVE\tPOS")
    
    
def subject_summary(students):
    print("Subject summary")
    for index in range(len(students[0])):
        decideForEachSubject(index, students)
    hardest_and_easiest_subject(students)
        
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
        else: 
            fail += 1
    value = [passes, fail, subject]
    return value


def hardest_and_easiest_subject(students):
    pass_and_fails = []
    hardest = 0
    easiest = 0
    for index in range(len(students[0])):
        pass_and_fails = number_of_passes(index, students)
        if pass_and_fails[1] >= len(students[0]):
            hardest = index
        else: easiest = index
        
    scores = number_of_passes(hardest, students)
    scoreTwo = number_of_passes(easiest, students)
    print(f"the hardest subject is subject {hardest + 1} with {scores[1]} failures\nthe easiest subject is subject {easiest + 1} with {scoreTwo[1]} failures")
    values = get_best_graduating_student(students)
    print(f"the overall highest score is scored by student {values[0][1] + 1} in subject {values[0][2] + 1} scoring {values[0][0]}\nthe overall lowest score is scored by student {values[1][1] + 1} in subject {values[1][2] + 1} scoring {values[1][0]}")
    print("===============================================================")
    print("Class Summary")
    print("===============================================================")
    overall_students = overall_student(students)
    print(f"Best graduating student is:  student {overall_students[0][1] + 1} scoring {overall_students[0][0]}")
    print("===============================================================")
    print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    print(f"worst graduating student is:  student {overall_students[1][1] + 1} scoring {overall_students[1][0]}")
    print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    values = get_total_and_average_score(students)
    print(f"class total score is: {values[0]}\nclass average score is: {values[1]}")
    

def get_total_and_average_score(students):
    total = 0
    for index in range(len(students)):
        for count in range(len(students[index])):
            total += students[index][count]
    total_and_average = [total, (total / len(students))]
    return total_and_average




def overall_student(students):
    largest_total = students[0][1]
    best_student_index = 0
    worst_student_index = 0
    smallest_total = students[0][1]
    total = 0
    for index in range(len(students)):
        for count in range(len(students[index])):
            total += students[index][count]
        if total > largest_total:
            largest_total = total
            best_student_index = index
        elif total < smallest_total:
            smallest_total = total
            worst_student_index = row
    return [[largest_total, best_student_index], [smallest_total, worst_student_index]]



def get_best_graduating_student(students):
    largest = students[0][0]
    smallest = students[0][0]
    largest_student_index = 0
    smallest_student_index = 0
    largest_subject_index = 0
    smallest_subject_index = 0
    for index in range(len(students)):
        for column in range(len(students[index])):
            if students[index][column] > largest:
                largest = students[index][column]
                largest_student_index = index
                largest_subject_index = column
            elif students[index][column] < smallest:
                smallest = students[index][column]
                smallest_student_index = index
                smallest_subject_index = column
    return [[largest, largest_student_index, largest_subject_index], [smallest, smallest_student_index, smallest_subject_index]]


collect_scores(3, 3, [])
