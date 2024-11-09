package pkg1;
import pkg4.Product;

public abstract class Clothing implements Product{
    protected int year;
    private String color;

    public Clothing(){
        this.year = 2000;
        this.color = "Black";
    }

    public Clothing(int pubYear, String color){
        this.year = pubYear;
        this.color = color;
    }

    @Override
    public void setYear(){
        this.year = 2006;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static void sayClothing(){
        System.out.println("This is a piece of clothing.");
    }

    public int getYear(){
        return this.year;
    }
}