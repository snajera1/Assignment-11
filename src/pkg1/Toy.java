package pkg1;
import pkg4.Product;

abstract class Toy implements Product{
    protected int year;
    private String manufacturer;

    public Toy(){
        this.year = 2020;
        this.manufacturer = "Mattel";
    }

    public Toy(int year, String manufacturer){
        this.year = year;
        this.manufacturer = manufacturer;
    }

    @Override
    public void setYear(){
        this.year = 2024;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static void sayToy(){
        System.out.println("This is a toy");
    }

    public int getYear(){
        return this.year;
    }
}
