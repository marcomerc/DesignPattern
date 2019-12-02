package lab4;

import java.util.List;

public class averageWeighted implements Average {


	@Override
	public double getAvg(List<Double> Exams, List<Double> Assignments) {
		Double totalE = 0.0;
		Double totalA = 0.0;
		for(Double exam: Exams) {
			totalE+=exam;
		}
		
		if(Assignments.size() > 1) {
			double min = 100;
			for(Double assign: Assignments) {
				if(min >= assign) {
					min = assign;
				}
				totalA+=assign;
				
			}	
			totalA-= min;
			
		}else {
			for(Double assign: Assignments) {
				totalA+=assign;
			}
		}
		return (totalA/(Assignments.size()-1))*.4 +.6*(totalE/Exams.size());
	}

}
