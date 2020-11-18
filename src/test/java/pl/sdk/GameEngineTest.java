package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class GameEngineTest {

    private GameEngine game;
    private List<Creature> attackerList = new ArrayList<>();
    private List<Creature> defenderList = new ArrayList<>();
    Creature attacker = new Creature("Attacker", 5, 10, 100, 5);
    Creature attacker2 = new Creature("Attacker2", 5, 10, 100, 5);
    Creature defender = new Creature("Defender", 20, 5, 100, 5);

    @BeforeEach
    void init() {
        attackerList.add(attacker);
        attackerList.add(attacker2);
        defenderList.add(defender);
        game = new GameEngine(attackerList, defenderList);
    }

    @Test
    void creatureShouldCounterAttackOncePerEveryTurn() {
        game.attack(game.getBoard().get(attacker).getX(), game.getBoard().get(attacker).getY());  //attacker attack defender

        assertEquals(90, attacker.getCurrentHp());
        assertEquals(100, attacker2.getCurrentHp());

        game.pass();    //attacker2 pass
        game.pass();    //defender pass
        game.attack(game.getBoard().get(attacker).getX(), game.getBoard().get(attacker).getY());  //attacker attack defender

        assertEquals(80, attacker.getCurrentHp());
        assertEquals(100, attacker2.getCurrentHp());
    }

}