public class Main {
    public static void main(String args[])
    {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        //double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",1);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Bacon",2);
        hamburger.addHamburgerAddition4("Double Meat",4);

        System.out.println("Your total price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyburger = new HealthyBurger("Bacon",5.65);
        healthyburger.addHamburgerAddition1("Lettuce",0.75);
        healthyburger.addHealthAddition1("Tomato",1);
        System.out.println("Your total price is: "+ healthyburger.itemizeHamburger());

        DeluxeBurger deluxeburger = new DeluxeBurger();
        deluxeburger.itemizeHamburger();
        System.out.println("Your total price is: "+ deluxeburger.itemizeHamburger());


    }
}
