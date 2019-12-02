package lab4;

public class GradeTracker {
	String letter;
	Student subject;
	

	public GradeTracker(Student student) {
		subject = student;
		 double grade=student.getAverage();
		 setLetterGrade(grade);
		 subject.addObserver(this);
	}
	
	String getLetterGrade() {
		return letter;
	}
	void updateLetterGrade() {
		Double grade = subject.getAverage();
		setLetterGrade(grade);
		
	}
	void setLetterGrade(Double grade) {
		if (grade >=90) {
			 letter = new String("A");
		 }else if (grade >= 80) {
			 letter = new String("B");
		 }else if (grade >= 70) {
			 letter = new String("C");
		 }else if (grade >= 60) {
			 letter = new String("D");
		 }else{
			 letter = new String("F");
		 }
	}
	
	
}
