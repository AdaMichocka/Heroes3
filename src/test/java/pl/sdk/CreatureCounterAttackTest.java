package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatureCounterAttackTest {

    @Test
    void creatureShouldCounterAttack() {
        Creature attacker = new Creature("Attacker", 5, 10, 100, 5);
        Creature defender = new Creature("Defender", 20, 5, 100, 5);
        attacker.attack(defender);

        assertEquals(90, attacker.getCurrentHp());
    }

    @Test
    void creatureShouldCounterAttackOnlyOnceAtTurn() {
        Creature attacker = new Creature("Attacker", 5, 10, 100, 5);
        Creature attacker2 = new Creature("Attacker2", 5, 10, 100, 5);
        Creature defender = new Creature("Defender", 20, 5, 100, 5);
        attacker.attack(defender);

        assertEquals(90, attacker.getCurrentHp());
        assertEquals(100, attacker2.getCurrentHp());
    }

}
