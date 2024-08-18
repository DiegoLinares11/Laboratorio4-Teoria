import java.util.*;

class State {
    int id;
    boolean isAccept;
    Map<Character, List<State>> transitions = new HashMap<>();

    State(int id, boolean isAccept) {
        this.id = id;
        this.isAccept = isAccept;
    }

    void addTransition(char symbol, State toState) {
        transitions.computeIfAbsent(symbol, k -> new ArrayList<>()).add(toState);
    }
}
