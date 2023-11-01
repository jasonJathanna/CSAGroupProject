import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
//Define variables
    int index;
    ArrayList<Student> students = new ArrayList<>();
// method adds new students to system
    public void generateStudents() {
        Scanner sc = new Scanner(System.in);
//Ask if want to create new profiles 
        System.out.println("Do you want to add a student? Enter...\n0)No\n1)Yes");
        int input = sc.nextInt();
//if yes, add on to students array list
        if (input == 1) {
            students.add(new Student());
//create personalized student id
            System.out.println("Enter student id");
// assign it to tha specific student
            students.get(students.size() - 1).setId(sc.nextInt());
//Set schedule
            System.out.println("Enter in class codes for their current four classes:");
            for (int i = 0; i < 4; i++) {
                students.get(students.size() - 1).addClass(sc.nextInt());
            }
// initialize grades?
             students.get(students.size() - 1).setGrade(0);

            generateStudents();

        } 
        else if (input == 0) {
            homePage();
        }
// if input not valid recall method until valid
        else {
            System.out.println("Error! Invalid input, try again.");
            generateStudents();

        }


    }
//match index to the inputed student id
    public void setIndex() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the student's ID number");
        int studentID = reader.nextInt();
        int i = 0;
        for (Student student: students) {

            if(student.getId() == studentID){
                index = i;
            }
             i++;
        }
    }

//create homepage method
//contains all methods to any user action
    public void homePage() {
        Scanner reader = new Scanner(System.in);
//Enter number based on what to edit or view
        System.out.println("Enter...\n 1.Exit \n 2.See grades \n 3.See tardies \n 4.See classes \n 5.Take attendance \n 6.Change grades \n 7. For the next day \n 8. add a student");
        int input = reader.nextInt();
        switch (input) {
//Exit
            case 1:
                break;
            case 2:
//call method to View grade point average
                setIndex();
                seeGrades();
                break;
//call method to view tardies
            case 3:
                setIndex();
                seeTardies();
                break;
//call method to view class
            case 4:
                setIndex();
                seeClasses();
                break;
// call method to Edit present or absent
            case 5:
                setIndex();
                markStudentAbsentOrPresent();
                break;
//call method to Edit grade
            case 6:
                setIndex();
                changeStudentGrade();
                break;
//refersh, sets to next day
            case 7:
                refresh();
                break;
            case 8:
                generateStudents();
                break;
//Returns to homepage 
            default:
                System.out.println("Invalid input!");
                homePage();
        }
    }
//view percentage based arraylist average
    public void seeGrades() {
        Scanner reader = new Scanner(System.in);
//Exit options
        System.out.println("Enter 0 to go back");
//calculate percent grade from number grade
        System.out.println("GPA: "+students.get(index).getGrade() + "%");
        reader.nextInt();
//Return to homepage
        homePage();

    }
//Change to string so it says present/absent instead of boolean
    public void seeTardies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to go back");
//Change array list to string so it says present/absent instead of boolean
        System.out.println(students.get(index).getAttendence().toString());
        sc.nextInt();
//Return to homepage
        homePage();
    }
//View list of classes
    public void seeClasses() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to go back");
// Change to string and display
        System.out.println(students.get(index).getClasses().toString());
        sc.nextInt();
//Return to homepage
        homePage();
    }
//Mark absent or present
    public void markStudentAbsentOrPresent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter...\n1)Absent\n2)Present\n3)Return to Homepage");
// switch two options switch attend
        switch (sc.nextInt()) {
//Call markAbsent function
            case 1:
                students.get(index).markAbsent();
//Return to homepage
                homePage();
                break;
//Call markPresent function
            case 2:
                students.get(index).markPresent();
//Return to homepage
                homePage();
                break;
            case 3:
//Return to homepage
                homePage();
                break;
            default:
                System.out.println("Invalid input! Choose another option:");
//If input is invalid, recall method to enter new input
                markStudentAbsentOrPresent();


        }
    }

    public void changeStudentGrade() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter..\n1)Change a student's grade\n2)Go back");
        int changeGradeInput = reader.nextInt();
        if (changeGradeInput == 2) {
//Return to homepage
            homePage();
        }
//add to student's grade point average
        if (changeGradeInput == 1) {
            System.out.println("Enter student's grade:");
            int newGrade = reader.nextInt();
//print grade variable
            students.get(index).setGrade(newGrade);
            homePage();
        } else {
            System.out.println("Invalid entry!");
            changeStudentGrade();
        }

    }

//Sets to next day for attendance
    public void refresh() {
//changes has been marked to false
        for (Student student : students) {
            if (student.isHasBeenMarked() == false) {
                student.markPresent();
            }
        }

        for (Student student : students) {
            student.setHasBeenMarked(false);
        }

        homePage();

    }


}



