
public class StudentManager {

    public void generateStudents(){

    }

    public void homePage(){

    }

    public void seeGrades(){
Scanner reader = new Scanner(System.in);
		int x, back;
		String[] students = {"dude", "other dude", "random russian", "unknown", "classified"};
		int[] grades = {7, 69, 420, 49, 87};
	for (x=0; x<=(students.length-1); x++) {
			
			System.out.print(students[x]);
			System.out.println(" "  + grades[x] + "%");
	System.out.println("enter any number to go back");
	back = reader.nextInt();
	if (back <= 0 || back >= 0) {
		//call the method to go back
		// i dont know what it is or how to becuase im some what dumb
	}
	
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
