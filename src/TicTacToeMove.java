public class TicTacToeMove extends Move {
    private final int row, col;
    public TicTacToeMove(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
