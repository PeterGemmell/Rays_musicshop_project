package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    IPlay note;
    ISell markup;


    @Before
    public void before(){
        piano = new Piano("Steinway", "Sitka spruce", "mahogany", "percussion", 3500.00, 14500.00, 88);
    }

    @Test
    public void getName(){
        assertEquals("Steinway", piano.getName());
    }

    @Test
    public void hasNumOfKeys(){
        assertEquals(88, piano.getNumOfKeys());
    }
    @Test
    public void pianoPlaysSound(){
        assertEquals("note", piano.playSound());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(3500.00, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(14500.00, piano.getRetailPrice(), 0.01);
    }

    @Test
    public void pianoMarkupPrice(){
        assertEquals(11000.00, piano.calculateMarkup(), 0.01);
    }
}
