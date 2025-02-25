package myLudo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    @Test
    public void testPawnMovement() {
        Pawn pawn = new Pawn(Direction.EAST);
        pawn.move(5);
        assertEquals(2, pawn.getPosition());
        pawn.move(3);
        assertEquals(5, pawn.getPosition());
    }

    @Test
    public void setPawnSessionToFinished_testToGetPawnSession() {
        Pawn pawn = new Pawn(Direction.EAST);
        pawn.setSession(Session.IS_FINISHED);
        assertEquals(Session.IS_FINISHED, pawn.getSession());
    }

    @Test
    public void testThatPawnWillFinish_testToGetPawnPositionAfterItFinished_testToGetPawnSession_testPawn() {
        Pawn pawn = new Pawn(Direction.EAST);
        pawn.move(5);
        assertEquals(2, pawn.getPosition());
        pawn.move(3);
        assertEquals(5, pawn.getPosition());
        pawn.finish();
        assertEquals(Session.IS_FINISHED, pawn.getSession());
        assertEquals(-1, pawn.getPosition());
    }

    @Test
    public void testThatWhenPawnPositionReachSixItWillChangeDirectionToNorth_testToGetPawnPosition_testPawn() {
        Pawn pawn = new Pawn(Direction.EAST);
        pawn.move(5);
        assertEquals(2, pawn.getPosition());
        pawn.move(2);
        assertEquals(4, pawn.getPosition());
        pawn.move(2);
        assertEquals(6, pawn.getPosition());
        assertEquals(pawn.getDirection(), Direction.NORTH);
    }


    @Test
    public void testThatWhenPawnPositionReachSixItWillChangeDirectionToNorth_moveSixMoreTimes_testIfDirectionChangeEast_testToGetPawnPosition_testPawn() {
        Pawn pawn = new Pawn(Direction.EAST);
        pawn.move(5);
        assertEquals(2, pawn.getPosition());
        pawn.move(2);
        assertEquals(4, pawn.getPosition());
        pawn.move(2);
        assertEquals(6, pawn.getPosition());
        assertEquals(pawn.getDirection(), Direction.NORTH);
        pawn.move(6);
        assertEquals(12, pawn.getPosition());
        assertEquals(pawn.getDirection(), Direction.EAST);
    }


    @Test
    public void testThatWhenPawnPositionReachSixItWillChangeDirectionToNorth_moveSixMoreTimes_addTwoMoreTimes_testIfDirectionChangeEast_testToGetPawnPosition_testPawn() {
        Pawn pawn = new Pawn(Direction.EAST);
        pawn.move(5);
        assertEquals(2, pawn.getPosition());
        pawn.move(2);
        assertEquals(4, pawn.getPosition());
        pawn.move(2);
        assertEquals(6, pawn.getPosition());
        assertEquals(pawn.getDirection(), Direction.NORTH);
        pawn.move(6);
        assertEquals(12, pawn.getPosition());
        assertEquals(pawn.getDirection(), Direction.EAST);
        pawn.move(2);
        assertEquals(pawn.getDirection(), Direction.SOUTH);
    }
}