import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    int index;
    ArrayList<Student> students = new ArrayList<>();

    public void generateStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add a student? Enter...\n0)No\n1)Yes");
        int input = sc.nextInt();

        if (input == 1) {
            students.add(new Student());
            System.out.println("Enter student id");
            students.get(students.size() - 1).setId(sc.nextInt());
            System.out.println("Enter in class codes for their current four classes:");

            for (int i = 0; i < 4; i++) {
                students.get(students.size() - 1).addClass(sc.nextInt());
            }
             students.get(students.size() - 1).setGrade(0);

            generateStudents();


        } else if (input == 0) {

        } else {
            System.out.println("Error! Invalid input, try again.");
            generateStudents();

        }


    }

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

    public void homePage() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter...\n 1.Exit \n 2.See grades \n 3.See tardies \n 4.See classes \n 5.Take attendance \n 6.Change grades \n 7. For the next day");
        int input = reader.nextInt();
        switch (input) {
            case 1:
                break;
            case 2:
                setIndex();
                seeGrades();
                break;
            case 3:
                setIndex();
                seeTardies();
                break;
            case 4:
                setIndex();
                seeClasses();
                break;
            case 5:
                setIndex();
                markStudentAbsentOrPresent();
                break;
            case 6:
                setIndex();
                changeStudentGrade();
                break;
            case 7:
                refresh();
                break;
            default:
                System.out.println("Invalid input!");
                homePage();
        }
    }

    public void seeGrades() {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter 0 to go back");
        System.out.println(students.get(index).getGrade() + "%");
        reader.nextInt();
//Return to homepage
        homePage();

    }

    public void seeTardies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to go back");
        System.out.println(students.get(index).getAttendence().toString());
        sc.nextInt();
//Return to homepage
        homePage();
    }

    public void seeClasses() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to go back");
        System.out.println(students.get(index).getClasses().toString());
        sc.nextInt();
//Return to homepage
        homePage();
    }

    public void markStudentAbsentOrPresent() {

        Scanner sc = new Scanner(System.in);
        //Ask to choose two options
        System.out.println("Enter...\n1)Absent\n2)Present\n3)Return to Homepage");

//loop to repeat incase of wrong input

// switch two options switch attend
        switch (sc.nextInt()) {
            case 1:
                students.get(index).markAbsent();
//Return to homepage
                homePage();
                break;
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
//If input is invalid, recall method to wnter new inout
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

        if (changeGradeInput == 1) {
            System.out.println("Enter student's grade:");
            int newGrade = reader.nextInt();
            students.get(index).setGrade(newGrade);
            homePage();
        } else {
            System.out.println("Invalid entry!");
            changeStudentGrade();
        }

    }


    public void refresh() {

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



