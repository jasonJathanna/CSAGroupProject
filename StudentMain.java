
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentManager sm = new StudentManager();
// Genrate new students first
		sm.generateStudents();
//Call homepage to let user choose actions
		sm.homePage();
	}

}
