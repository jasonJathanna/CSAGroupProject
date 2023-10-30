
public class StudentManager {
    int index;
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

	public void setIndex(){
	   Scanner reader = new Scanner(System.in);
	System.out.println("Enter the students ID number")
        index = reader.nextInt();
	}
    public void homePage(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter \n 1. to exit \n 2. to see grades \n 3. to see tardies \n 4 to see classes \n 5. to take attendance \n 6. to change grades \n 7. for the next day")
            int input = reader.nextInt();
            switch (input) {
                case 1:
                    break;
                case 2:
		    setIndex()
                    seeGrades();
                    break;
                case 3:
		    setIndex()
                    seeTardies();
                    break;
                case 4:
		    setIndex()
                    seeClasses();
                    break;
                case 5: 
		    setIndex()
                    markStudentAbsentOrPresent();
                    break;
                case 6:
		    setIndex()
                    changeStudentGrade();
                    break;
                case 7:
                    refresh();
                    break;
                default:
                    System.out.println("This is not a valid entry.")
		    homePage();
    }

    public void seeGrades(){
	    
Scanner reader = new Scanner(System.in);

	    System.out.println("enter 0 to go back");
	    System.out.println( students.get(index).getGrade() + "%" );
	    reader.nextInt();
	    homePage();
		
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
                System.out.println("This is not a valid entry")
		changeStudentGrade();
			}
	    
    }

    public void refresh(){

	     for(Student student : students){
		if(student.getBeenMarked() == false){
			student.markHere();
		}
	    }
	    
	    
	    for(Student student : students){
		student.setBeenMarked(false);
	    }
	    
    }




}
