package pkg1;

public class Laptop extends Computers{
    private int res;
    protected String screen;

    public Laptop(){
        this.year = 2000;
        this.res = 1440;
        this.screen = "IPS";
    }

    public Laptop(int year, int res, String screen){
        this.year = year;
        this.res = res;
        this.screen = screen;
    }

    public void setRes(int res){
        this.res = res;
    }

    public void setRes(){
        this.res = 1080;
    }
    
    @Override
    public void setYear(){
        this.year = 2005;
    }


    public int getRes(){
        return this.res;
    }

}
