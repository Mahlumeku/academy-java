package Player;

import java.util.Scanner;

public class Game {

    private Player[] players; // Array to hold two players
    private Board board; // The game board
    private static Scanner scanner = new Scanner(System.in); // Scanner for user input

    public Game() {
        // Initialize the players array with two Player objects
        this.players = new Player[2];
        this.board = new Board(); // Initialize the board
    }

    public void setUpGame() {
        System.out.println("Enter player 1's name: ");
        players[0] = new Player(scanner.nextLine(), "1"); // Create first player
        System.out.println("Enter player 2's name: ");
        String playerTwoName = scanner.nextLine();
        
        // Logic to prevent players from having the same name
        while (playerTwoName.equals(players[0].getName())) {
            System.out.println("Error! Both Players cannot have the same name.");
            System.out.println("Enter player 2's name: ");
            playerTwoName = scanner.nextLine();
        }
        
        players[1] = new Player(playerTwoName, "2"); // Create second player

        // Set up the board
        board.boardSetUp(); // Set up the board using the method from the Board class
        board.printBoard(); // Print the initial state of the board
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner!");
    }

    public void playerTurn(Player currentPlayer) {
        int col = currentPlayer.makeMove(); // Get the player's move
        while (!board.addToken(col, currentPlayer.getPlayerNumber())) { // Keep trying until a valid move
            System.out.println("Column is full or invalid. Please try again.");
            col = currentPlayer.makeMove(); // Ask for a new move
        }
        board.printBoard(); // Print the board after the token is added
    }

    public void play() {
        boolean noWinner = true; // Track if there is no winner yet
        this.setUpGame(); // Set up the game
        int currentPlayerIndex = 0; // Start with the first player

        while (noWinner) {
            if (board.boardFull()) { // Check if the board is full
                System.out.println("Board is now full. Game Ends.");
                return; // End the game if the board is full
            }

            Player currentPlayer = players[currentPlayerIndex]; // Get the current player
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn: " + currentPlayer.getName());
            playerTurn(currentPlayer); // Let the current player take their turn
            
            // Check if the current player is the winner
            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer); // Print the winner
                noWinner = false; // End the loop
            } else {
                // Move to the next player, wrapping around with modulus
                currentPlayerIndex = (currentPlayerIndex + 1) % players.length; 
            }
        }
    }
}
