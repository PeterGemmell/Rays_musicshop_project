package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numOfVales;

    public Trumpet( String name, String material, String colour, String type, double costPrice, double retailPrice, int numOfVales){
        super(name, material, colour, type, costPrice, retailPrice);
        this.numOfVales = numOfVales;
    }

    public int getNumOfVales(){
        return this.numOfVales;
    }

    public String playSound(){
        return "toot";
    }

}
