public class TicTacToeBoard {
    private TicTacToeSymbol[][] board;
    private final int numRows, numCols;

    public TicTacToeBoard(int numRows, int numCols) {
        this.numCols = numCols;
        this.numRows = numRows;
        board = new TicTacToeSymbol[numRows][numCols];
    }

    public void initialize() {
        for (int row = 0; row < numRows; row++)
            for (int col = 0; col < numCols; col++)
                board[row][col] = null;
    }

    public void display() {
        System.out.println("Internal state of the board");
        for (int row = 0; row < numRows; row++) {
            if (board[row][0] != null)
                System.out.print(board[row][0].toString());
            else
                System.out.print("  ");
            for (int col = 1; col < numCols; col++) {
                if (board[row][col] != null)
                    System.out.print("| " + board[row][col].toString());
                else
                    System.out.print("|  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isFull() {
        for (int row = 0; row < numRows; row++)
            for (int col = 0; col < numCols; col++)
                if (board[row][col] == null)
                    return false;
        return true;
    }

    public boolean isRowCaptured(TicTacToeSymbol symbol) {
        for (int row = 0; row < numRows; row++) {
            boolean rowOccupied = true;
            for (int col = 0; col < numCols; col++) {
                if (!symbol.equals(board[row][col])) {
                    rowOccupied = false;
                    break;
                }
            }
            if (rowOccupied)
                return true;
        }
        return false;
    }

    public boolean isColCaptured(TicTacToeSymbol symbol) {
        for (int col = 0; col < numCols; col++) {
            boolean colOccupied = true;
            for (int row = 0; row < numRows; row++) {
                if (!symbol.equals(board[row][col])) {
                    colOccupied = false;
                    break;
                }
            }
            if (colOccupied)
                return true;
        }
        return false;
    }

    public boolean isDiagonalCaptured(TicTacToeSymbol symbol) {
        return false; // todo complete this
    }

    public void set(int row, int col, TicTacToeSymbol symbol) {
        // todo: add validation - check if the place is not preoccupied
        board[row][col] = symbol;
    }

    public Pair<Integer, Integer> firstEmptyLocation() {
        for (int row = 0; row < numRows; row++)
            for (int col = 0; col < numCols; col++)
                if (board[row][col] == null)
                    return new Pair<>(row, col);
    }
}
