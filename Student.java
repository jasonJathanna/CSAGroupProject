import java.util.ArrayList;

public class Student {

	 private boolean hasBeenMarked;
	    private ArrayList<AttendenceState> attendence = new ArrayList<>();
	    private ArrayList<Integer> grades = new ArrayList<>();
	    private ArrayList<Integer> classes = new ArrayList<>();
	    private int id;
	    private int grade;
	    

	    public void markAbsent(){
	        if(hasBeenMarked){
	           System.out.println("attendece for this students was already compleated"); 
	        } else{
	        attendence.add(AttendenceState.absent);
	        hasBeenMarked = true;
	        }
	    }

	    public void markPresent(){
	       if(hasBeenMarked){
	           System.out.println("attendece for this students was already compleated"); 
	        } else{
	        attendence.add(AttendenceState.present);
	        hasBeenMarked = true;
	        }
	        
	    }

	    public void addClass(int classID){
	        classes.add(classID);
	    }





	    public boolean isHasBeenMarked() {
	        return hasBeenMarked;
	    }

	    public void setHasBeenMarked(boolean hasBeenMarked) {
	        this.hasBeenMarked = hasBeenMarked;
	    }

	    public ArrayList<AttendenceState> getAttendence() {
	        return attendence;
	    }

	    public void setAttendence(ArrayList<AttendenceState> attendence) {
	        this.attendence = attendence;
	    }

	    public ArrayList<Integer> getClasses() {
	        return classes;
	    }

	    public void setClasses(ArrayList<Integer> classes) {
	        this.classes = classes;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getGrade() {
	        return grade;
	    }

	    public void setGrade(int grade) {
	        this.grade = grade;
	    }

}




    public boolean isHasBeenMarked() {
        return hasBeenMarked;
    }

    public void setHasBeenMarked(boolean hasBeenMarked) {
        this.hasBeenMarked = hasBeenMarked;
    }

    public ArrayList<Boolean> getAttendence() {
        return attendence;
    }

    public void setAttendence(ArrayList<Boolean> attendence) {
        this.attendence = attendence;
    }

    public ArrayList<Integer> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Integer> classes) {
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



}
