import Accessories.Accessories;
import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.Instrument;

import java.util.ArrayList;
import java.util.Collection;

public class Shop {

    private ArrayList<Instrument> instruments;
    private ArrayList<Accessories> accessories;

    public Shop(){
        instruments = new ArrayList<Instrument>();
        accessories = new ArrayList<Accessories>();
    }

    public void addInstrument(Instrument instrument){
        this.instruments.add(instrument);
    }

    public void addAccessories(Accessories accessories){
        this.accessories.add(accessories);
    }


    public int getInstrumentCount(){
        return this.instruments.size();
    }

    public int getAccessoriesCount(){
        return this.accessories.size();
    }

    public void removeInstrument(Instrument instrument){
        this.instruments.remove(instrument);
    }

    public void removeAccessories(Accessories accessories){
        this.accessories.remove(accessories);
    }


//    public ArrayList<ISell> getSell(){
//        ArrayList<ISell> sell = new ArrayList<>();
//        sell.addAll(this.instruments);
//        return sell;
//    }
}
