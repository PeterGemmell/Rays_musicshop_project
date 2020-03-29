package Accessories;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;
    ISell markup;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Wells Music", "Paper", 3.00, 11.00, "Jazz");
    }

    @Test
    public void getMake(){
        assertEquals("Wells Music", sheetMusic.getMake());
    }

    @Test
    public void hasGenre(){
        assertEquals("Jazz", sheetMusic.getGenre());
    }

    @Test
    public void madeFromAMaterial(){
        assertEquals("Paper", sheetMusic.getMaterial());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(3.00, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(11.00, sheetMusic.getRetailPrice(), 0.01);
    }

    @Test
    public void sheetMusicMarkup(){
        assertEquals(8.00, sheetMusic.calculateMarkup(), 0.01);
    }
}
