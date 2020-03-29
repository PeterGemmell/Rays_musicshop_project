package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {


    private int numOfKeys;

    public Piano(String name, String material, String colour, String type, double costPrice, double retailPrice, int numOfKeys){
        super(name, material, colour, type, costPrice, retailPrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys(){
        return this.numOfKeys;
    }

    public String playSound(){
        return "note";
    }


}
