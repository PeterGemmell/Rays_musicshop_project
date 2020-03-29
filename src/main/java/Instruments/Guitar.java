package Instruments;


import Behaviours.IPlay;
import Behaviours.ISell;


public class Guitar extends Instrument implements IPlay, ISell {


    private int numOfStrings;



    public Guitar( String name, String material, String colour, String type, double costPrice, double retailPrice, int numOfStrings){
        super(name, material, colour, type, costPrice, retailPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumberOfStrings(){
        return this.numOfStrings;
    }

    public String playSound() {
        return "strum";
    }

}
