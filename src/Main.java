public class Main {
    public static void main(String[] args) {
        Game game = TicTacToeFactory.singlePlayerStandard3x3Game();
        game.play();
    }
}
