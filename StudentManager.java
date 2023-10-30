
public class StudentManager {

    public void generateStudents(){

    }

    public void homePage(){

    }

    public void seeGrades(){
Scanner reader = new Scanner(System.in);
		int x;
		String[] students = {"dude", "other dude", "random russian", "unknown", "classified"};//random list until we have students
		int[] grades = {7, 69, 420, 49, 87};//random list until we actually have grades inputed into this
	for (x=0; x<=(students.length-1); x++) {
			
			System.out.print(students[x]);
			System.out.println(" "  + grades[x] + "%");
			}
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
