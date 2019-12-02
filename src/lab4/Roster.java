package lab4;
import java.util.ArrayList;
import java.util.List;

public class Roster {
	
	private List<Student> Students;

	private String Name;
	private String Number;
	public Roster(String name, String number){
		Name   = name;
		Number = number;
		Students = new ArrayList<>();
	}
	public String getCourseName() {
		return Name;
	}
	public void addStudent(Student student) {
		Students.add(student);
	}
	
	public  averageOfStudents averages() {
		return new averageOfStudents(this);
	}
	public Double getStudentAvg(int index) {
		return Students.get(index).getAverage();
	}
	public int getRosterSize() {
		return Students.size();
	}
	
}
