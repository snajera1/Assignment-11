package pkg1;
import pkg4.Product;

public abstract class Book implements Product{

    protected int year;
    private int pageCount;

    public Book(){
        this.year = 2000;
        this.pageCount = 200;
    }

    public Book(int pubYear, int pageCount){
        this.year = pubYear;
        this.pageCount = pageCount;
    }

    @Override
    public void setYear(){
        this.year = 2006;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static void sayBook(){
        System.out.println("This is a book");
    }

    public int getYear(){
        return this.year;
    }
}
