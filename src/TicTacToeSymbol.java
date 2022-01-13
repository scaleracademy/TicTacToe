public class TicTacToeSymbol {
    private final String symbol;

    public TicTacToeSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        return super.equals(obj);
    }
}
