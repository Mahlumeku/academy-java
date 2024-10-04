package Player;
import java.util.Scanner; 
/**
 * The player class is concerned with descibing a player and things that relate
 * to it. It keeps track of the name of a player, the order of the player in
 * relation to other players in the game, and the move the player may want to
 * make (which is just as simple as the user picking which column of the board
 * they want their token to be dropped in). This class could also have logic to
 * create only valid users. E.g. the playerNumber should not be greater than 4
 * based on the specification we've received.
 */
public class Player {

	private String name;
// Add other instance variable(s)
	private int playerNumber;

// Question: should scanner be static or not?
	private static Scanner scanner = new Scanner(System.in); // complete line

public Player(String name, int playerNumber) {
    // complete constructor
    this.name = name;
    if(playerNumber > 0 && playerNumber <= 4){
        this.playerNumber = playerNumber;
    } else {
        throw new IllegalArgumentException("Player numer must be between 1 and 4");
    }
}

// create getter methods
	public String getName() {
		return name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public int makeMove() {
		System.out.println("Make your move. What column do you want to put a token in?");
		int column = scanner.nextInt(); // receive user input
		return column;
	}

	public String toString() {
		return ("Player " + playerNumber + " is " + name);
	}
}