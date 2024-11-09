package pkg1;

public class Shirt extends Clothing {

    protected String size;
    private double price;

    public Shirt(){
        this.year = 2000;
        this.size = "XXL";
        this.price = 15.0;
    }

    public Shirt(String size, double price){
        this.size = size;
        this.price = price;
    }

    public void setSize(){
        this.size = "L";
    }

    public void setSize(String size){
        this.size = size;
    }

    @Override
    public void setYear(){
        this.year = 2020;
    }

    public String getSize(){
        return this.size;
    }
    
}
