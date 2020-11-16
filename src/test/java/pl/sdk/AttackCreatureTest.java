package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttackCreatureTest {

    @Test
    void creatureShouldLost10HpWhenAttackerHas20AttackAndDefenderHas10Armor() {
        Creature a = new Creature("Attacker", 20, 5, 100, 5);
        Creature b = new Creature("Defender", 5, 10, 100, 5);
        a.attack(b);

        assertEquals(90, b.getCurrentHp());
    }
}
