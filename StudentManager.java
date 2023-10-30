
public class StudentManager {

    public void generateStudents(){

    }

    public void homePage(){

    }

    public void seeGrades(){
	    
Scanner reader = new Scanner(System.in);

	    System.out.println();
	    System.out.println( students.get(index).getGrade());
	    reader.netInt();
	    homePage();
		int x, back;
		String[] students = {"dude", "other dude", "random russian", "unknown", "classified"};//random list of names until we have some
		int[] grades = {7, 69, 420, 49, 87};//random list of grade until we have input
	for (x=0; x<=(students.length-1); x++) {
			
			System.out.print(students[x]);
			System.out.println(" "  + grades[x] + "%");
	System.out.println("enter any number to go back");
	back = reader.nextInt();
	if (back <= 0 || back >= 0) {
		   homePage();
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
