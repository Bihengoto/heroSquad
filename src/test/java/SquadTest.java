import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly() {
        Squad testSquad = new Squad("Jan", 20, "Tribalism");
        assertTrue(testSquad instanceof Squad);
    }

    @Test
    public void newSquad_getName() {
        Squad testSquad = new Squad("Jan", 20, "Tribalism");
        assertEquals("Jan", testSquad.getName());
    }

    @Test
    public void newSquad_maxsize() {
        Squad testSquad = new Squad("Jan", 20, "Tribalism");
        assertEquals(20, testSquad.getMax_size());
    }

    @Test
    public void newSquad_getCause(){
        Squad testSquad = new Squad("Jan", 20, "Tribalism");
        assertEquals("Tribalism", testSquad.getCause());
    }

    @Test
    public void newHero_getWeakness(){
        Hero testHero = new Hero("Isaac", 28, "running", "Falling");
        assertEquals("Falling", testHero.getWeakness());
    }
}