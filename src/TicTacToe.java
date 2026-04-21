import java.util.Random;
public class TicTacToe {
    static char[][] board = new char[3][3];
    static char player1Symbol, player2Symbol, currentPlayerSymbol;
    static int currentPlayer;
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        tossAndAssignSymbols();
        System.out.println("Player " + currentPlayer + " starts with " + currentPlayerSymbol);
    }
    static void initializeBoard() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = '-';
    }
    static void printBoard() {
        System.out.println("------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) System.out.print(board[row][col] + " | ");
            System.out.println();
            System.out.println("------");
        }
    }
    static void tossAndAssignSymbols() {
        int toss = new Random().nextInt(2);
        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayerSymbol = player1Symbol;
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentPlayerSymbol = player2Symbol;
        }
    }
}