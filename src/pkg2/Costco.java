package pkg2;
import pkg3.Store;

public final class Costco implements Store{
    protected String location;
    private String type;

    public Costco(){
        this.location = "Michigan";
        this.type = "Warehouse";
    }

    public Costco(String location, String type){
        this.location = location;
        this.type = type;
    }

    @Override
    public void setLocation(){
        this.location = "California";
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }
}
