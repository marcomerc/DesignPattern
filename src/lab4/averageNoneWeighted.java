package lab4;

import java.util.List;

public class averageNoneWeighted implements Average {


	@Override
	public double getAvg(List<Double> Exams, List<Double> Assignments) {
		Double totalE = 0.0;
		Double totalA = 0.0;
		for(Double exam: Exams) {
			totalE+=exam;
		}
		for(Double assign: Assignments) {
			totalA+=assign;
		}
		return (totalA/Assignments.size())*.4 +.6*(totalE/Exams.size());
	}

}
