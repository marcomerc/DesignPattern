package lab4;

public class averageOfStudents {
	
	private int index = 0;
	private Roster roster;
	
	public averageOfStudents(Roster roster) {
		this.roster = roster;
	}

	public double getNextAvg() { 
		double avg =roster.getStudentAvg(index);
		index++;
		return avg;
		
	}
	public boolean done() {
		
		return (index >= roster.getRosterSize());
	}
	
	public void start() {
		index = 0;
	}

}
