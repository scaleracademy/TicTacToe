import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer implements Player {
    private final String name;
    private BufferedReader br;

    public HumanPlayer(String name) {
        this.name = name;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Move makeMove(PlayerVisibleState state) {
        System.out.println(name + ": Please enter the cell number (1-9)");
        state.display();
        try {
            int cell = Integer.parseInt(br.readLine());
            cell = cell - 1;
            return new TicTacToeMove(cell/3, cell%3);
        } catch (IOException ignored) {
        }
        return null;
    }
}
