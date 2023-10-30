import java.util.ArrayList;

public class Student {


    private boolean hasBeenMarked;
    private ArrayList<Boolean> attendence = new ArrayList<>();

    private ArrayList<String> classes = new ArrayList<>();
    private int id;
    private int grade;

    public void markAbsent(){
        attendence.add(false);
    }

    public void markPresent(){
        attendence.add(true);
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

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
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
