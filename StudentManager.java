
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
