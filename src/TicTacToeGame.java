import java.util.List;

public class TicTacToeGame extends Game {
    TicTacToeBoard board;
    List<Player> players;
    List<TicTacToeSymbol> symbols;
    int currentPlayerIndex;

    public TicTacToeGame(TicTacToeBoard board, List<TicTacToeSymbol> symbols, List<Player> players) {
        this.board = board;
        this.players = players;
        this.symbols = symbols;
    }

    @Override
    void initialize() {
        currentPlayerIndex = 0;
        board.initialize();
    }

    @Override
    String getGameTitle() {
        return "Tic Tac Toe";
    }

    @Override
    void displayGameState() {
        board.display();
    }

    @Override
    boolean isDraw() {
        return board.isFull();
    }

    @Override
    boolean hasWinner() {
        TicTacToeSymbol symbol = getCurrentPlayerSymbol();
        return board.isRowCaptured(symbol)
                || board.isColCaptured(symbol)
                || board.isDiagonalCaptured(symbol);

    }

    @Override
    void makeMove(Move move) {
        if (!(move instanceof TicTacToeMove)) {
            // throw new InvalidMoveException();
            return;
        }
        TicTacToeSymbol symbol = getCurrentPlayerSymbol();
        TicTacToeMove m = (TicTacToeMove) move;
        board.set(m.getRow(), m.getCol(), symbol);
    }

    @Override
    Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    private TicTacToeSymbol getCurrentPlayerSymbol() {
        return symbols.get(currentPlayerIndex);
    }

    @Override
    Player getWinningPlayer() {
        return getCurrentPlayer();
    }

    @Override
    PlayerVisibleState getPlayerVisibleState(Player player) {
        return new TicTacToePlayerVisibleState(board);
    }

    @Override
    void updateCurrentPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
