package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

    Guitar guitar;
    IPlay strum;
    ISell markup;



    @Before
    public void before(){
        guitar = new Guitar("Fender Stratocaster", "maple wood", "blue", "string instrument", 200.00, 700.00, 6);

    }

    @Test
    public void getName(){
        assertEquals("Fender Stratocaster", guitar.getName());
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarPlaySound(){
        assertEquals("strum", guitar.playSound());

    }

    @Test
    public void hasCostPrice(){
        assertEquals(200.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(700.00, guitar.getRetailPrice());
    }

    @Test
    public void guitarMarkupPrice(){
        assertEquals(500.00, guitar.calculateMarkup(), 0.01);
    }





}
