
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

        Scanner sc = new Scanner(System.in);
        //Ask to choose two options 
        System.out.println("Enter\n1)Absent\n2)Present\n3)Return to Homepage");

//loop to repeat incase of wrong input
       
// switch two options switch attend
        switch(sc.nextInt()){
            case 1: 
                students.get(index).markAbsent();
                homePage();
                //remember to return to homepage
                break;
            case 2: 
                students.get(index).markePresent();
                homePage();
                break;
                 //remember to return to homepage
            case 3: 
                homePage();
                 //remember to return to homepage
                break;
            default:
                System.out.println("Invalid input! Choose another option:");
                markStudentAbsentOrPresent();
                

        
        }
    }
    public void changeStudentGrade(){

    }

    public void refresh(){

    }




}
