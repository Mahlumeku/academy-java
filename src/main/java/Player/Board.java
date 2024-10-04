package Player;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    // Add instance variables
    private String[][] board;
    private Scanner scanner = new Scanner(System.in);

    // Method to set up the board with rows and columns
    public void boardSetUp() {
        System.out.println("------ Board Set up -------");
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt(); // receive user input
        System.out.print("Number of cols: ");
        int cols = scanner.nextInt(); // receive column value
        this.board = new String[rows][cols]; // initialize a row by column array

        // Initialize empty board with dashes (-)
        for (int i = 0; i < rows; i++) {
            // Fill up each row of the board with dashes
            for (int j = 0; j < cols; j++) {
                board[i][j] = "-";
            }
        }
    }

    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public boolean columnFull(int col) {
        // Check if the column is full by checking the topmost row's value
        return !board[0][col].equals("-"); // If the top row is not "-", the column is full
    }

    public boolean boardFull() {
        // Check if the board is full by checking all columns
        for (int i = 0; i < this.board[0].length; i++) {
            if (!columnFull(i)) {
                return false; // If any column is not full, the board is not full
            }
        }
        return true;
    }

    public boolean addToken(int colToAddToken, String token) {
        int rowToAddToken = board.length - 1; // Start from the bottom row

        // Condition to keep searching for the right row level of the board to place the token
        while (rowToAddToken >= 0) { // Ensure we stay within bounds
            if (board[rowToAddToken][colToAddToken].equals("-")) {
                board[rowToAddToken][colToAddToken] = token; // Place the token
                return true; // Token placed successfully
            } else {
                rowToAddToken -= 1; // Move to the row above
            }
        }

        return false; // No space in the column to place the token
    }

    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        return checkHorizontal(playerNumber) || checkVertical(playerNumber) || checkLeftDiagonal(playerNumber) || checkRightDiagonal(playerNumber);
    }

    public boolean checkVertical(String playerNumber) {
        for (int col = 0; col < board[0].length; col++) {
            // length - 3 here because we are comparing 4 in a row items
            for (int row = 0; row < board.length - 3; row++) {
                if (board[row][col].equals(playerNumber) &&
                    board[row + 1][col].equals(playerNumber) &&
                    board[row + 2][col].equals(playerNumber) &&
                    board[row + 3][col].equals(playerNumber)) {
                    return true; // Found 4 in a column
                }
            }
        }
        return false;
    }

    public boolean checkHorizontal(String playerNumber) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber) &&
                    board[row][col + 1].equals(playerNumber) &&
                    board[row][col + 2].equals(playerNumber) &&
                    board[row][col + 3].equals(playerNumber)) {
                    return true; // Found 4 in a row
                }
            }
        }
        return false;
    }

    public boolean checkLeftDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber) &&
                    board[row + 1][col + 1].equals(playerNumber) &&
                    board[row + 2][col + 2].equals(playerNumber) &&
                    board[row + 3][col + 3].equals(playerNumber)) {
                    return true; // Found 4 in a left diagonal
                }
            }
        }
        return false;
    }

    public boolean checkRightDiagonal(String playerNumber) {
        for (int row = 3; row < board.length; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber) &&
                    board[row - 1][col + 1].equals(playerNumber) &&
                    board[row - 2][col + 2].equals(playerNumber) &&
                    board[row - 3][col + 3].equals(playerNumber)) {
                    return true; // Found 4 in a right diagonal
                }
            }
        }
        return false;
    }

    // Uncomment this to test your board class in isolation
    public static void main(String[] args) {
        Board board1 = new Board();
        board1.boardSetUp();
        board1.printBoard();

        board1.addToken(0, "x");
        board1.addToken(0, "x");
        board1.addToken(0, "x");
        board1.addToken(1, "y");
        board1.addToken(1, "z");
        board1.addToken(1, "w");
        board1.addToken(0, "x");

        System.out.println("Board for testing checkVertical");
        System.out.println("Board 1 check vertical with x returns -> " + board1.checkVertical("x"));
        System.out.println("Board 1 check vertical with y returns -> " + board1.checkVertical("y"));

        board1.printBoard();

        Board board2 = new Board();
        // Test with at least a 4-by-4 size board
        board2.boardSetUp();
        board2.printBoard();

        board2.addToken(0, "x");
        board2.addToken(0, "x");
        board2.addToken(0, "w");
        board2.addToken(0, "w");
        board2.addToken(1, "y");
        board2.addToken(1, "x");
        board2.addToken(1, "w");
        board2.addToken(2, "y");
        board2.addToken(2, "w");
        board2.addToken(2, "x");
        board2.addToken(3, "w");
        board2.addToken(3, "w");
        board2.addToken(3, "w");
        board2.addToken(3, "x");

        System.out.println("Board for testing diagonals");
        System.out.println("Board 2 check right diagonal with x returns -> " + board2.checkRightDiagonal("x"));
        System.out.println("Board 2 check right diagonal y returns -> " + board2.checkRightDiagonal("y"));
        System.out.println("Board 2 check left diagonal w returns -> " + board2.checkLeftDiagonal("w"));

        board2.printBoard();
    }
}
