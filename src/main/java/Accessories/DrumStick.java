package Accessories;

import Behaviours.ISell;

public class DrumStick extends Accessories implements ISell {

    private String tipType;


    public DrumStick(String make, String material, double costPrice, double retailPrice, String tipType){
        super(make, material, costPrice, retailPrice);
        this.tipType = tipType;
    }

    public String getTipType(){
        return this.tipType;
    }
}
