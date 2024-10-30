package Week4;

public class HiddenWord {

	/** Declare any fields (instance variables) **/
	private String hiddenWord;

	/** Declare a constructor */
	public HiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}

	/** Write the getHint method */
	public String getHint(String guess) {
		// Initialize a StringBuilder to construct the hint
		StringBuilder hint = new StringBuilder();

		// Iterate through each character in the guess
		for (int i = 0; i < guess.length(); i++) {
			char guessChar = guess.charAt(i);
			char hiddenChar = hiddenWord.charAt(i);

			if (guessChar == hiddenChar) {
				// If the letter is in the correct position, add it to the hint
				hint.append(guessChar);
			} else if (hiddenWord.indexOf(guessChar) != -1) {
				// If the letter is in the word but in the wrong position, add a plus sign
				hint.append("+");
			} else {
				// If the letter is not in the word at all, add an asterisk
				hint.append("*");
			}
		}
		// Return the final hint
		return hint.toString();
	}

	/** This is a main method for testing the class */
	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
		System.out.println(puzzle.getHint("HELLO") + " it should print H****");
		System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
		System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
		System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

	} // end of main

} // end of class
