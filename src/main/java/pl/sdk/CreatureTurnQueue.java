package pl.sdk;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class CreatureTurnQueue {

    private final Collection<Creature> creatures;
    private final Queue<Creature> creatureQueue;
    private Creature activeCreature;

    public CreatureTurnQueue(Collection<Creature> creatureList) {
        creatures = creatureList;
        creatureQueue = new LinkedList<>();
        creatureQueue.addAll(creatures);
        next();
    }

    Creature getActiveCreature() {
        return activeCreature;
    }

    void next() {
        activeCreature = creatureQueue.poll();

    }
}
