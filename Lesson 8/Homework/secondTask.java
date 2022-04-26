package firstTask;

public class secondTask {

	public static void main(String[] args) {

// setting variables
		String sentence = "Sixty zippers were quickly picked from the woven jute bag";
		
		boolean[] alphabet = new boolean[26];
		boolean pangram = true;
		int index = 0;

// iterate through all characters and index
		for (int i = 0; i < sentence.length(); i++) {
			
			char chara = sentence.charAt(i);

// calculate through all iterations
			if(chara >= 'A' && chara <= 'Z') {
				index = chara - 'A';
			} else if(chara >= 'a' && chara <= 'z') {
				index = chara - 'a';
			}
			
			alphabet[index]  = true;
		}

// mark each boolean to false
		for (int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == false) {
			pangram = false;
			}
		}

// output
		if (pangram) {
			System.out.println("The sentence '" + sentence + "' is a pangram!");
		} else {
			System.out.println("The sentence '" + sentence + "' is not a pangram.");
		}
		
	} 
		
}
