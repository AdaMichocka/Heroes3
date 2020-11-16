package pl.sdk;

import java.util.Collection;

public class CreatureTurnQueue {

    private final Collection<Creature> creatures;

    public CreatureTurnQueue(Collection<Creature> creatureList) {
        creatures = creatureList;
    }
}
