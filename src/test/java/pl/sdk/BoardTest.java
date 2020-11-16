package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;
    private Creature creature;

    @BeforeEach
    void init() {
        board = new Board();
        creature = new Creature();
    }

    @Test
    void shouldAddCreature() {
        board.add(new Point(0, 0), creature);

        Creature creatureFromBoard = board.get(0, 0);

        assertEquals(creature, creatureFromBoard);
    }

    @Test
    void shouldReturnNullWhenFieldIsEmpyt() {
        Creature creatureFromBoard = board.get(0, 0);

        assertNull(creatureFromBoard);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTryAddCreatureToNotEmptyField() {
        board.add(new Point(0, 0), creature);
        Creature creature2 = new Creature();
        assertThrows(IllegalArgumentException.class, () -> board.add(new Point(0, 0), creature2));
    }

    @Test
    void shouldMoveCreature() {
        board.add(new Point(0, 0), creature);
        board.moveCreature(new Point(1, 1), creature);

        Creature oldCreature = board.get(0, 0);
        Creature creatureFromBoard = board.get(1, 1);

        assertNull(oldCreature);
        assertEquals(creature, creatureFromBoard);
    }

}