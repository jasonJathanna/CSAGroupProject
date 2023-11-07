# CSAGroupProject
Requirements 
Our program will
Be from the administrative point of view
Create student profiles
Have a home page where the user can choose what element they would like to edit by calling methods
Take attendance (absent, or present) using a enum value
Assign and report GPA
Allow the teacher to change a student’s grade
Schedule students for classes
See a students classes
Check for errors 

Our program won’t 
Read in text input
We will not account for tardies, only absent and present 
Be able to change schedule

Types of inputs our program will handle
Integers

Error  Checking
Ex: if invalid input recall method (recursion) 
Mark Student Absent or Present
Homepage - use default statements in the homepage switch statement that prevents invalid input
Change student grades
Design 
Class Student 
Var

Boolean hasBeenMarked

ArrayList of enum(AttendenceState) attendance 
ArrayList of Integer classesId

Int Id

Int grade


Methods

MarkAbsent
adds absent to attendance if has been marked is false 
Then sets has been marked to true 

MarkPresent
adds present to attendance if has been marked is false 
Then sets has been marked to true 


Getters and setters


Class StudentManager

Var

ArrayList of Students

Methods
// for all of the recursive methods if they get a input that they can’t take it prints ERROR invalid input then calls itself or home page 



Generate Students

Asks if they want to make a student 
If no 
Call method Home page 

If yes 

Asks for name
 	Asks for 4 classIds

Then calls the method Generate Students

asks if you want to 
1. Exit 
2. See grades
3. See tardies
4. See classes
5. Mark student absent or tardy
6. Change student grade
7. Next Day
8. Add a student.

 if option 2,3,4,5,6 was chosen it calls set index method

If exit end program 
Then if its not exit calls next day method 

Set index

Asks for a student id number
Then loops though students and finds the student with the that id 
And saves in in index
If there is an invalid input it defaults to the first student in students

See Grades
give option for back 
  1. Back - calls home page method 
Print their grade with 
students.get(index).getGrade();



See attendance 

give option for back 

1. Back - calls home page method 
Does attendence .toString for that student 

See classes

Gives option for back
1. Back - calls home page method 
Does classes .toString for that student 


Mark Student absent or present
gives back option 
Back - calls home page method 
Present option - calls mark present method 
Absent option - calls mark absent method 

Change student grade
gives back option 
1. Back - calls home page method 
Asks if you want to change the grade
Then asks what it should be 

Next Day /refresh

 all students who haven’t been marked it will add present to their attendance 
Then it will set their HasBeen marked to false.


Code

Github link

https://github.com/jasonJathanna/CSAGroupProject

Note: the text-edit-branch is the most up to date branch view/use that one and NOT main



Presentation (video, we can imbed link here)
