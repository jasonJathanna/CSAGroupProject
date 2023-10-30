
public class StudentManager {

    public void generateStudents(){
         Scanner sc = new Scanner(System.in);
	 System.out.println("do you want to add a student 0 for no 1 for yes");
	 int input = sc.nextInt();
	 
	 if(input == 1) {
		 students.add(new Student());
		 System.out.println("enter in their id");
		 students.get(students.size()-1).setId(sc.nextInt());
		 System.out.println("enter in the four classes they are takeing");
		 students.get(students.size()-1).setClasses( students.get(students.size()-1).getClasses().add(sc.nextInt()));
		 students.get(students.size()-1).setClasses( students.get(students.size()-1).getClasses().add(sc.nextInt()));
		 students.get(students.size()-1).setClasses( students.get(students.size()-1).getClasses().add(sc.nextInt()));
		 students.get(students.size()-1).setClasses( students.get(students.size()-1).getClasses().add(sc.nextInt()));
		 students.get(students.size()-1).setGrade(0);
		 
		 generateStudents();
		 
		 
		
		 
	 } else if(input == 0) {
		 
	 } else  {
		 System.out.println("error invalid input try again ");
		 generateStudents();
		 
	 }
 
 
    }

    public void homePage(){

    }

    public void seeGrades(){

    }

    public void seeTardies(){
Scanner sc = new Scanner(System.in);
	    System.out.println("enter 0 to go back");
	    System.out.println("true means they were here false means they were not");
		System.out.println(students.get(index).getAttendence().toString());
	    sc.nextInt();

	    homePage();
    }

    public void seeClasses(){
	Scanner sc = new Scanner(System.in);
	    System.out.println("enter 0 to go back");
		System.out.println(students.get(index).getClasses().toString());
	    sc.nextInt();

	    homePage();
    }
    public void markStudentAbsentOrPresent(){

    }
    public void changeStudentGrade(){

    }

    public void refresh(){

    }




}
