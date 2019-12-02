package lab4;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Double> Assignments; 
	private List<Double> Exams;
	private boolean Weighted;
	private Average regularAverage;
	private Average dropLowestAssignment;
	private List<GradeTracker> observers;
	
	public Student(String StudentName){
		this.name           = StudentName;
		Assignments         = new ArrayList<>();
		Exams               = new ArrayList<>();
		regularAverage      = new averageNoneWeighted();
		dropLowestAssignment= new averageWeighted();
		Weighted = false;
		observers           = new ArrayList<>();
	}
	
	public void addAssignmentScore(Double As) {
		Assignments.add(As);
		notifyObservers();

	}
	
	public String getStudentName() {
		return name;
	}
	public void addExamScore(double exam) {
		Exams.add(exam);
		notifyObservers();
	}
	
	public void dropLowestAssign(boolean drop) {
		Weighted = drop;
	}
	public void notifyObservers() {
		for(GradeTracker Obs: observers) {
			Obs.updateLetterGrade();
		}
	}
	

	public Double getAverage(){
		if(Weighted) {
			return dropLowestAssignment.getAvg(Exams, Assignments);
		}else {
			return regularAverage.getAvg(Exams, Assignments);
		}
	}



	public void addObserver(GradeTracker gradeTracker) {
		observers.add(gradeTracker);
		
	}
	
}

