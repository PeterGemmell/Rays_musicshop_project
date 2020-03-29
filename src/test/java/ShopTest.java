import Accessories.DrumStick;
import Accessories.SheetMusic;
import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    SheetMusic sheetMusic;
    DrumStick drumStick;

    @Before
    public void setUp() throws Exception{
        shop = new Shop();
        guitar = new Guitar("Fender Stratocaster", "maple wood", "blue", "string instrument", 200.00, 700.00, 6);
        piano = new Piano("Steinway", "Sitka spruce", "mahogany", "percussion", 3500.00, 14500.00, 88);
        trumpet = new Trumpet("Elkhart", "rose brass", "brass", "brass instrument", 70.00, 190.00, 3);
        sheetMusic = new SheetMusic("Wells Music", "Paper", 3.00, 11.00, "Jazz");
        drumStick = new DrumStick("Vic Firth", "Hickory Wood", 1.00, 4.00, "barrel");
        shop.addInstrument(guitar);
        shop.addInstrument(piano);
        shop.addInstrument(trumpet);
        shop.removeInstrument(guitar);
        shop.addAccessories(sheetMusic);
        shop.addAccessories(drumStick);
    }

    @Test
    public void canAddInstrumentToStock(){
        shop.addInstrument(guitar);
        assertEquals(3, shop.getInstrumentCount()); // where is the expected 4 coming from ???
    }

    @Test
    public void canAddAccessoryToStock(){
        shop.addAccessories(sheetMusic);
        assertEquals(3, shop.getAccessoriesCount());
    }

    @Test
    public void canRemoveInstrumentFromStock(){
        shop.removeInstrument(guitar);
        assertEquals(2 , shop.getInstrumentCount()); // why is it expecting 2 ???
    }

    @Test
    public void canRemoveAccessoryFromStock(){
        shop.removeAccessories(sheetMusic);
        assertEquals(1, shop.getAccessoriesCount());
    }

//    @Test
//    public void canGetAllSell(){
//        ArrayList<ISell> sell = shop.getSell();
//        assertEquals(3 , sell.size());
//    }
}
