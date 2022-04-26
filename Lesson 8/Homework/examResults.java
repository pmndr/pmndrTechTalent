package firstTask;

public class examResults {

// set variables
	public static void main(String[] args) {
		double bioResult = 100;
		double chemResult = 130;
		double physResult = 75;
// calculations
		double total = bioResult + chemResult + physResult;
		double percent = (total * 100) / 450;

// output of results
		System.out.println("Your results are:");
		System.out.println("Biology: " + bioResult + "/150");
		System.out.println("Chemistry: " + chemResult + "/150");
		System.out.println("Physics: " + physResult + "/150");
		System.out.println("Your total score is: " + total + ", which is " + percent + "%");
		
// output of pass status
		if (percent < 60) {
			System.out.println("Sorry, you have failed your exams.");
		} else {
			System.out.println("Congratulations! You have passed your exams.");
		}
		
		
	}

}
