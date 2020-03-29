package Accessories;

import Behaviours.ISell;

public class SheetMusic extends Accessories implements ISell {

    private String genre;

    public SheetMusic(String make, String material, double costPrice, double retailPrice, String genre){
        super(make, material, costPrice, retailPrice);
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }
}
