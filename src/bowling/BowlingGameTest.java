package bowling;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest{
    private BowlingGame game;

    @BeforeClass
    public void setUp() {
        game = new BowlingGame();

    }

    @Test(expected = Exception.class)
    public void testGutterGame() {
        int n = 20;
        int pins = 0;
        rollMany(n, pins);
        assertEquals(0, game.score());
    }

    private void rollMany(int n, int pins) {

        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void testallOnes() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }
    @Test
    public void testOneSpare(){
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16, game.score());
    }

    @Test
    public void testOneStrike(){
        game.roll(10); //Strike
        game.roll(3);
        game.roll(4);
        rollMany(16,0);
        assertEquals(24,game.score());

    }

    @Test
    public void testStrikeOnSecondAtempt(){
        game.roll(0);
        game.roll(10);
        game.roll(3);
        game.roll(6);
        rollMany(16,0);
        assertEquals(19,game.score());
    }

    @Test
    public void testPerfectGame(){
        rollMany(12,10);
        assertEquals(300,game.score());
    }
    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

}
