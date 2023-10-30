
public class StudentManager {

    public void generateStudents(){

    }

    public void homePage(){
        System.out.println("Enter \n 1. to exit \n 2. to see grades \n 3. to see tardies \n 4 to see classes \n 5. to take attendence \n 6. to change grades \n 7. for the next day")
            int input = reader.nextInt();
            switch (input) {
                case 1:
                    break;
                case 2:
                    seeGrades();
                    break;
                case 3:
                    seeTardies();
                    break;
                case 4:
                    seeClasses();
                    break;
                case 5: 
                    markStudentAbsentOrPresent();
                    break;
                case 6:
                    changeStudentGrade();
                    break;
                case 7:
                    refresh();
                    break;
                default:
                    System.out.println("This is not a valid entry. Enter \n 1. to exit \n 2. to see grades \n 3. to see tardies \n 4 to see classes \n 5. to take attendence \n 6. to change grades \n 7. for the next day")
    }

    public void seeGrades(){

    }

    public void seeTardies(){

    }

    public void seeClasses(){

    }
    public void markStudentAbsentOrPresent(){

    }
    public void changeStudentGrade(){

    }

    public void refresh(){

    }




}
