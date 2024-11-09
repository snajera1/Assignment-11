package pkg1;

public class Doll extends Toy {
    
    protected double price;
    private String brand;

    public Doll(){
        this.year = 2020;
        this.price = 100.0;
        this.brand = "Barbie";
    }

    public Doll(int year, double price, String brand){
        this.year = year;
        this.price = price;
        this.brand = brand;
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
