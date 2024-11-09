package pkg1;
import pkg4.Product;

public abstract class KitchenAppliance implements Product{
    protected int year;
    private String manufacturer;

    public KitchenAppliance(){
        this.year = 2000;
        this.manufacturer = "Ninja";
    }

    public KitchenAppliance(int pubYear, String manufacturer){
        this.year = pubYear;
        this.manufacturer = manufacturer;
    }

    @Override
    public void setYear(){
        this.year = 2006;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static void sayKitchenAppliance(){
        System.out.println("This is a kitchen appliance");
    }

    public int getYear(){
        return this.year;
    }
    
}
