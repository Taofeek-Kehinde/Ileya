'''
PSEDOCODE
START
1. Ask for the number of students enrolled
2. Ask for the number of quizzes token
3. Collect each student's score for every quiz
4. Constraint: Score must be between 0 and 100
5. Assign a grade: A (70-100), B(60-69) C(50-59)F(below 50)
6. Identify the quiz with the highest average across all studens
7. Display the number of students who passed(score avg >=50)
STOP
'''
# Asking for numbers of student and quiz
number_of_students = int(input("How many students? "))
number_of_quizzes = int(input("How many quizzes? "))

how_many_students_passed = 0

# For each student
for student_number in range(number_of_students):
    print("\nStudent", student_number + 1)
    
    total_score_for_this_student = 0
    
    # Get all the quiz scores 
    for quiz_number in range(number_of_quizzes):
        while True:
            score_for_this_quiz = float(input("Quiz " + str(quiz_number + 1) + " score: "))
            if score_for_this_quiz >= 0 and score_for_this_quiz <= 100:
                break
            else:
                print("Invalid score! Score must be between 0 and 100")
        total_score_for_this_student = total_score_for_this_student + score_for_this_quiz
    
    # Calculate the average score 
    average_score_for_this_student = total_score_for_this_student / number_of_quizzes
    print("Average:", average_score_for_this_student)
    
    # Assign grade for the student
    if average_score_for_this_student >= 70:
        letter_grade = "A"
    elif average_score_for_this_student >= 60:
        letter_grade = "B"
    elif average_score_for_this_student >= 50:
        letter_grade = "C"
    else:
        letter_grade = "F"
    
    print("Grade:", letter_grade)
    
    # Count all the student that pass once above 50
    if average_score_for_this_student >= 50:
        how_many_students_passed = how_many_students_passed + 1

# Show how many passed
print("\nNumber of students who passed:", how_many_students_passed, "out of", number_of_students)
