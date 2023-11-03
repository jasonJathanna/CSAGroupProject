import java.util.ArrayList;

public class Student {
//define variables/methods

    private boolean hasBeenMarked;
    private ArrayList<Boolean> attendence = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<Integer> classes = new ArrayList<>();
    private int id;
    private int grade;
    

    public void markAbsent(){
        if(hasBeenMarked){
           System.out.println("Attendece for this students was already compleated"); 
        } else{
        attendence.add(false);
        hasBeenMarked = true;
        }
    }

    public void markPresent(){
       if(hasBeenMarked){
           System.out.println("Attendece for this students was already compleated"); 
        } else{
        attendence.add(true);
        hasBeenMarked = true;
        }
        
    }
    
    public void addGrade(int newGrade) {
    	grades.add(newGrade);
    }
    public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
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



