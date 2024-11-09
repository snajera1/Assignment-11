package pkg1;

public class Blender extends KitchenAppliance {

    protected double price;
    private String color;

    public Blender(){
        this.year = 2000;
        this.price = 100.0;
        this.color = "Black";
    }

    public Blender(int year, double price, String color){
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public void setPrice(){
        this.price = 200.0;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public void setYear(){
        this.year = 2020;
    }

    public double getPrice(){
        return this.price;
    }
    
    
}
