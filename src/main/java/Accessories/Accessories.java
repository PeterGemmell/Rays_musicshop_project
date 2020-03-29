package Accessories;

public abstract class Accessories {

    private String make;
    private String material;
    private double costPrice;
    private double retailPrice;

    public Accessories(String make, String material, double costPrice, double retailPrice){
        this.make = make;
        this.material = material;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public double calculateMarkup(){
        return this.retailPrice -= costPrice;
    }
}
