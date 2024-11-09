package pkg2;
import pkg3.Store;

public final class Target implements Store{
    protected String location;
    private String type;

    public Target(){
        this.location = "Michigan";
        this.type = "Merchandise";
    }

    public Target(String location, String type){
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
