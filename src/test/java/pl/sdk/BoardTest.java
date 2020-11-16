package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void shouldAddCreature() {
        Board board = new Board();
        Creature creature = new Creature();
        board.add(new Point(0, 0), creature);

        Creature creatureFromBoard = board.get(new Point(0, 0));

        assertEquals(creature, creatureFromBoard);
    }

}