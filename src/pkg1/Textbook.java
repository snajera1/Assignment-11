package pkg1;

public class Textbook extends Book{

    protected String subject;
    private String publisher;
   
    public Textbook(){
        this.year = 2000;
        this.subject = "Science";
        this.publisher = "Pearson";
    }

    public Textbook(String subject, String publisher){
        this.subject = subject;
        this.publisher = publisher;
    }

    public void setSubject(){
        this.subject = "math";
    }

    public void setSubject(String sub){
        this.subject = sub;
    }

    public String getSubject(){
        return this.subject;
    }

    @Override
    public void setYear(){
        this.year = 2020;
    }
}
