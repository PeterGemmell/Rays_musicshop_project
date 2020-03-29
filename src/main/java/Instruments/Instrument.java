package Instruments;


import Behaviours.IPlay;

public abstract class Instrument {

    private String name;
    private String material;
    private String colour;
    private String type;
    private double costPrice;
    private double retailPrice;

    public Instrument(String name, String material, String colour, String type, double costPrice, double retailPrice){

        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public abstract String playSound();



    public double calculateMarkup() {
        return this.retailPrice -= costPrice;
    }
}
