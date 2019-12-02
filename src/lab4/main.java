package lab4;

import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
//		Student student = new Student("Marco Mercado");
//        student.addAssignmentScore(90.1);
//        student.addAssignmentScore(90.1);
//        student.addAssignmentScore(78.3);
//        student.addExamScore(90);
//        student.addExamScore(90);
//
//        DecimalFormat df = new DecimalFormat("0.0");
//
//     // without dropping a class
//        System.out.println("without dropping the lowest assignment "+student.getStudentName() + "  " +
//                           df.format(student.getAverage()));
//
//        
//        student.dropLowestAssign(true);
//        //should use algorithm A by default:
//        System.out.println("dropping the lowest assignment "+student.getStudentName() + "  " +
//                               df.format(student.getAverage()));
//
//        student.dropLowestAssign(false); // 
//        System.out.println("going back to not dropping the lowest assignment "+student.getStudentName() + "  " +
//                df.format(student.getAverage()));
//
//        
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        
//      //test the GradeTracker
//		Student student = new Student("Marco Mercado");
//		student.addAssignmentScore(90.1);
//		student.addAssignmentScore(90.1);
//		student.addExamScore(90);
//		student.addExamScore(90);
//		
//        GradeTracker gradeT = new GradeTracker(student);
//        System.out.println("before adding a exam score letter grade: " + gradeT.getLetterGrade());
//        student.addExamScore(30);
//        System.out.println("Added an exam score.");
//        System.out.println("getting the letter grade from tracker after adding  exame score: " + gradeT.getLetterGrade());
//        
//        
//        
        
        
        
        
        
        
        
        
        
        Student student = new Student("Marco Mercado");
		student.addAssignmentScore(90.1);
		student.addAssignmentScore(90.1);
		student.addExamScore(90);
		student.addExamScore(90);
        
        Student Rafa = new Student("Rafel Mercado");
        Rafa.addAssignmentScore(80.0);
        Rafa.addAssignmentScore(80.1);
        Rafa.addAssignmentScore(85.3);
        Rafa.addExamScore(85.2);
        Rafa.addExamScore(85.3);
        
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("average of rafa before roster "+ student.getStudentName() + "  " +
                df.format(student.getAverage()));

      //should use algorithm A by default:
        System.out.println("average of rafa before roster " +Rafa.getStudentName() + "  " +
                               df.format( Rafa.getAverage()));


      //new roster
        Roster cs580 = new Roster("Software Engineering","CS5800");
        cs580.addStudent(student);
        cs580.addStudent(Rafa);
        
        System.out.println("Software Engineering grades:");
        averageOfStudents ad = cs580.averages();
        ad.start();
        while (!ad.done()) {
            System.out.println("next average "  +
                               df.format(ad.getNextAvg()));
        }
//        
        
	}

}
