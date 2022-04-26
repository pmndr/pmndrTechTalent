package firstTask;

public class Main {

	public static void main(String[] args) {

// Task 1, Part 1: Reversing strings in sentences
		String sentence = "are you as excited as I am?";
		
        String[] word = sentence.split(" "); 								//splitter
        
        for (int i = word.length - 1; i >= 0; i--) { 						//reversal
            String reverseSentence = word[i] + " ";
            System.out.println(reverseSentence); 							//output
		}
        
//Task 1, Part 2: Reversing Arrays
        
	    String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"}; // array list
	    for (int x = 0; x < wordList.length; x++) {	        				// individual arrays
	    	for (int y = wordList[x].length() - 1; y >= 0; y--) {			//reversal
	    		System.out.print(wordList[x].charAt(y));					//output
	    	}
	    }
	}
}



     