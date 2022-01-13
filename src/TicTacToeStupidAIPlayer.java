public class TicTacToeStupidAIPlayer  implements  Player {

    @Override
    public String getName() {
        return "Stupid AI";
    }

    @Override
    public Move makeMove(PlayerVisibleState state) {
        // make move at the first empty location
        Pair<Integer, Integer> cell = state.getFirstEmptyLocation();
        return new TicTacToeMove(cell.first, cell.second);
    }
}
