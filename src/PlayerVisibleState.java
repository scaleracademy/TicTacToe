public interface PlayerVisibleState {
    void display();

    Pair<Integer, Integer> getFirstEmptyLocation();
}
