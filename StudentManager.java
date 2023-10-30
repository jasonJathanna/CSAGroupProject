
public class StudentManager {
import java.util.Scanner;
    public void generateStudents(){

    }

    public void homePage(){

    }

    public void seeGrades(){

    }

    public void seeTardies(){

    }

    public void seeClasses(){

    }
    public void markStudentAbsentOrPresent(){
//Ask to choose two options 
        System.out.println("Enter\n1)Absent\n2)Present\n3)Return to Homepage");

//loop to repeat incase of wrong input
       while (){ 
// switch two options switch attend
        switch(attend){
            case 1: students.get(index).markabsent();
                //remember to return to homepage
                break;
            case 2: students.get(index).markepresent();
                 //remember to return to homepage
            case 3: students.homepage();
                 //remember to return to homepage
                break;
            default:
                System.out.println("Invalid input! Choose another option:");

        }
        }
    }
    public void changeStudentGrade(){

    }

    public void refresh(){

    }




}
