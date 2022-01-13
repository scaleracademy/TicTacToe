public interface Player {
    public String getName();

    Move makeMove(PlayerVisibleState state);
}
