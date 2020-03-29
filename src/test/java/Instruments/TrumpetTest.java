package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;
    IPlay toot;
    ISell markup;

    @Before
    public void before(){
        trumpet = new Trumpet("Elkhart", "rose brass", "brass", "brass instrument", 70.00, 190.00, 3);

    }

    @Test
    public void getName(){
        assertEquals("Elkhart", trumpet.getName());
    }

    @Test
    public void hasNumberOfVales(){
        assertEquals(3, trumpet.getNumOfVales());
    }

    @Test
    public void trumpetPlaySound(){
        assertEquals("toot", trumpet.playSound());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(70.00, trumpet.getCostPrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(190.00, trumpet.getRetailPrice(), 0.01);
    }

    @Test
    public void trumpetMarkupPrice(){
        assertEquals(120, trumpet.calculateMarkup(), 0.01);
    }
}
