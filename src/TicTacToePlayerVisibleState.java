public class TicTacToePlayerVisibleState implements PlayerVisibleState {
    private final TicTacToeBoard board;

    public TicTacToePlayerVisibleState(TicTacToeBoard board) {
        this.board = board;
    }

    public void display() {
        board.display();
    }

    @Override
    public Pair<Integer, Integer> getFirstEmptyLocation() {
        return board.firstEmptyLocation();
    }
}
