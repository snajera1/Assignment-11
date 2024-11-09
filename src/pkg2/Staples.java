package pkg2;
import pkg3.Store;

public final class Staples implements Store{
    protected String location;
    private String type;

    public Staples(){
        this.location = "Michigan";
        this.type = "Office supply";
    }

    public Staples(String location, String type){
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
