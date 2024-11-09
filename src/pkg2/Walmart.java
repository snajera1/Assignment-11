package pkg2;
import pkg3.Store;

public final class Walmart implements Store{
    protected String location;
    private String type;

    public Walmart(){
        this.location = "Michigan";
        this.type = "Supercenter";
    }

    public Walmart(String location, String type){
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
