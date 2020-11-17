package pl.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameEngine {

    private final Board board;
    private final CreatureTurnQueue queue;

    GameEngine(List<Creature> aCreatures1, List<Creature> aCreatures2) {
        board = new Board();
        putCreatureToBoard(aCreatures1, aCreatures2);
        List<Creature> twoSidesCreatures = new ArrayList();
        twoSidesCreatures.addAll(aCreatures1);
        twoSidesCreatures.addAll(aCreatures2);
        queue = new CreatureTurnQueue(twoSidesCreatures);
    }

    void move(Point aTarget) {
        board.move(queue.getActiveCreature(), aTarget);
    }

    private void putCreatureToBoard(List<Creature> aCreatures1, List<Creature> aCreatures2) {
        putCreatureFromOneSideToBoard(aCreatures1, 0);
        putCreatureFromOneSideToBoard(aCreatures2, Board.WIDTH - 1);
    }

    private void putCreatureFromOneSideToBoard(List<Creature> aCreatures, int i2) {
        for (int i = 0; i < aCreatures.size(); i++) {
            board.add(new Point(i2, i * 2), aCreatures.get(i));
        }
    }
}
