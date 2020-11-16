package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatureAttackTest {

    private Creature a;
    private Creature b;
    private Collection<Creature> creatureList;

    @BeforeEach
    void init() {
        a = new Creature();
        b = new Creature();
        creatureList = new ArrayList<>();
        creatureList.add(a);
        creatureList.add(b);
    }

    @Test
    void creatureAShouldAttackCreatureB() {
        a.attack(b, a.getStats().getAttack());

        assertEquals(9, b.getCurrentHp());
    }
}
