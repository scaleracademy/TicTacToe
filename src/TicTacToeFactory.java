import java.util.Arrays;

public class TicTacToeFactory {
    public static Game twoPlayerStandard3x3Game() {
        TicTacToeSymbol cross = new TicTacToeSymbol("X");
        TicTacToeSymbol nought = new TicTacToeSymbol("O");
        TicTacToeBoard board = new TicTacToeBoard(3, 3);
        Player player1 = new HumanPlayer("Subhrangshu");
        Player player2 = new HumanPlayer("Amit");
        return new TicTacToeGame(board, Arrays.asList(cross, nought), Arrays.asList(player1, player2));
    }

    public static Game singlePlayerStandard3x3Game() {
        TicTacToeSymbol cross = new TicTacToeSymbol("X");
        TicTacToeSymbol nought = new TicTacToeSymbol("O");
        TicTacToeBoard board = new TicTacToeBoard(3, 3);
        Player player1 = new HumanPlayer("Subhrangshu");
        Player player2 = new TicTacToeStupidAIPlayer();
        return new TicTacToeGame(board, Arrays.asList(cross, nought), Arrays.asList(player1, player2));
    }

}
