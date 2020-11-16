package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardMovingTest {
    private Board board;
    private Creature creature;

    @BeforeEach
    void init() {
        board = new Board();
        creature = new Creature();
        board.add(new Point(0, 0), creature);
    }

    @Test
    void creatureShouldMoveCorrectly() {
        board.moveCreature(new Point(0, 0), new Point(0, 1));

        Creature creatureFromBoard = board.get(0, 1);

        assertNull(board.get(0, 0));
        assertEquals(creature, creatureFromBoard);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTryToMoveCreatureToNotEmptyField() {
        board.add(new Point(0, 1), new Creature());

        assertThrows(IllegalArgumentException.class, () -> board.moveCreature(new Point(0, 0), new Point(0, 1)));

        Creature creatureFromBoard = board.get(0, 0);

        assertEquals(creature, creatureFromBoard);
    }

}
