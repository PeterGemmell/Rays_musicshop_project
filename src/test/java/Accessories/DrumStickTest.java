package Accessories;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;
    ISell markup;


    @Before
    public void before(){
        drumStick = new DrumStick("Vic Firth", "Hickory Wood", 1.00, 4.00, "barrel");
    }

    @Test
    public void getMake(){
        assertEquals("Vic Firth", drumStick.getMake());
    }

    @Test
    public void hasTipType(){
        assertEquals("barrel", drumStick.getTipType());
    }

    @Test
    public void madeFromAMaterial(){
        assertEquals("Hickory Wood", drumStick.getMaterial());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(1.00, drumStick.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(4.00, drumStick.getRetailPrice(), 0.01);
    }

    @Test
    public void drumStickMarkup(){
        assertEquals(3.00, drumStick.calculateMarkup(), 0.01);
    }
}
