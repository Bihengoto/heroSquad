import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHero_instantiatesCorrectly() {
        Hero testHero = new Hero("Isaac", 28, "running", "Falling");
        assertTrue(testHero instanceof Hero);
    }

    @Test
    public void newHero_getName() {
        Hero testHero = new Hero("Isaac", 28, "running", "Falling");
        assertEquals("Isaac", testHero.getName());
    }

    @Test
    public void newHero_getAge() {
        Hero testHero = new Hero("Isaac", 28, "running", "Falling");
        assertEquals(28, testHero.getAge());
    }

    @Test
    public void newHero_getPower(){
        Hero testHero = new Hero("Isaac", 28, "running", "Falling");
        assertEquals("running", testHero.getPower());
    }

    @Test
    public void newHero_getWeakness(){
        Hero testHero = new Hero("Isaac", 28, "running", "Falling");
        assertEquals("Falling", testHero.getWeakness());
    }
}