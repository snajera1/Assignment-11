package pkg1;
import pkg4.Product;

public abstract class Computers implements Product{

    protected int year;
    private String model;

    public Computers(){
        this.year = 2000;
        this.model = "Unknown";
    }

    public Computers(int year, String model){
        this.year = year;
        this.model = model;
    }

    @Override
    public void setYear(){
        this.year = 2000;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static void sayComputer(){
        System.out.println("This is a computer");
    }

    public int getYear(){
        return this.year;
    }
}

