package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttackCreatureTest {

    @Test
    void creatureShouldLost10HpWhenAttackerHas20AttackAndDefenderHas10Armor() {
        Creature attacker = new Creature("Attacker", 20, 5, 100, 5);
        Creature defender = new Creature("Defender", 5, 10, 100, 5);
        attacker.attack(defender);

        assertEquals(90, defender.getCurrentHp());
    }

    @Test
    void creatureShouldNotSelfeHealWhenAttackerHasLowerAttackThanDefenderArmor() {
        Creature attacker = new Creature("Attacker", 20, 5, 100, 5);
        Creature defender = new Creature("Defender", 5, 30, 100, 5);
        attacker.attack(defender);

        assertEquals(100, defender.getCurrentHp());
    }
}
