import pkg1.*;
import pkg2.*;

public class mainClass {
    

    public static void main(String[] args) {
        /*
         * Brief demonstration of how the polymorphism and inheritance in this project works with two objects, one from each package housing the important class categories.
         * There is also a brief demonstration of how multiple constructors work.
         */
        System.out.println("Following is a demonstration of inheritance, polymorphism, and various constructors. Check the notes in the code or readme for more info.");
        Laptop laptop = new Laptop(); //Establishes a laptop object with default constructor to make sure that the class was established correctly
        System.out.println(laptop.getRes()); //Shows polymorphism by calling an overloaded method twice with different parameters, and printing the different results
        laptop.setRes();
        System.out.println(laptop.getRes()); 
        laptop.setRes(720);
        System.out.println(laptop.getRes());
        
        System.out.println(laptop.getYear()); //Shows inheritance by calling a method from the parent class
        laptop.setYear(); //Calls an overridden method from the Computers abstract superclass

        Computers.sayComputer(); //Tests out one of the static methods from one of the abstract classes

        Costco costco = new Costco(); //Creates a test object from one of final classes in the second package
        System.out.println(costco.getLocation()); //Demonstrates how multiple constructors work by creating two Costco objects, a default one and one with specific parameters
        Costco costco1 = new Costco("Arkansas", "Warehouse");
        System.out.println(costco1.getLocation()); //Demonstrates polymorphism again by calling an overridden method, as well as an overloaded version of that method
        costco1.setLocation();
        System.out.println(costco1.getLocation());
        costco1.setLocation("Michigan");
        System.out.println(costco1.getLocation());




    }
}