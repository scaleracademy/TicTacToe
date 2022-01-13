public abstract class Game {
    abstract void initialize();
    abstract String getGameTitle();
    abstract void displayGameState();
    abstract boolean isDraw();
    abstract boolean hasWinner();
    abstract void makeMove(Move move);
    abstract Player getCurrentPlayer();
    abstract Player getWinningPlayer();
    abstract PlayerVisibleState getPlayerVisibleState(Player player);
    abstract void updateCurrentPlayer();

    // chess / snakes and ladders / tic tac toe
    // everyone can see the entire board

    // battleship / cards / scrabble


    void play() {
        System.out.println("Playing a game of " + getGameTitle());
        initialize();
        do {
            updateCurrentPlayer();
            displayGameState();
            Player currentPlayer = getCurrentPlayer();
            PlayerVisibleState state = getPlayerVisibleState(currentPlayer);
            Move move = currentPlayer.makeMove(state);
            makeMove(move);
        } while(!isDraw() && !hasWinner());
        displayGameState();
        if(isDraw()) {
            System.out.println("Game is a draw");
        } else if (hasWinner()) {
            Player winner = getWinningPlayer();
            System.out.println(winner.getName() + " has won the game!");
        }
    }
}

// Template Pattern
// Boilerplate code to perform some actions
