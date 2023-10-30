
public class StudentManager {
    int index;
    public void generateStudents(){

    }

    public void homePage(){
        System.out.println("Enter the students ID number")
        index = reader.nextInt();
        System.out.println("Enter \n 1. to exit \n 2. to see grades \n 3. to see tardies \n 4 to see classes \n 5. to take attendance \n 6. to change grades \n 7. for the next day")
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
                    System.out.println("This is not a valid entry. Enter \n 1. to exit \n 2. to see grades \n 3. to see tardies \n 4 to see classes \n 5. to take attendance \n 6. to change grades \n 7. for the next day")
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
        System.out.println("Enter 1 change a students grade or 2 to go back.")
            int changeGradeInput = reader.nextInt();
            if (changeGradeInput = 2) {
                homePage();
            }
            if (changeGradeInput = 1) {
                System.out.println("What would you like the students grade to be");
                int newGrade = reader.nextInt();
                    students.get(index).setGrade(newGrade);
            else {
                System.out.println("This is not a valid entry. Enter 1 change a students grade or 2 to go back.")
    }

    public void refresh(){

    }




}
