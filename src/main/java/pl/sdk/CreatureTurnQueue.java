package pl.sdk;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class CreatureTurnQueue {

    private final Collection<Creature> creatures;
    private final Queue<Creature> creatureQueue;
    private Creature activeCreature;

    CreatureTurnQueue(Collection<Creature> creatureList) {
        creatures = creatureList;
        creatureQueue = new LinkedList<>();
        initQueue();
        next();
    }

    private void initQueue() {
        creatureQueue.addAll(creatures);
    }

    Creature getActiveCreature() {
        return activeCreature;
    }

    void next() {
        if (creatureQueue.isEmpty()) {
            initQueue();
            creatureQueue.forEach(c -> c.resetCounterAttack());
        }
        activeCreature = creatureQueue.poll();
    }
}
