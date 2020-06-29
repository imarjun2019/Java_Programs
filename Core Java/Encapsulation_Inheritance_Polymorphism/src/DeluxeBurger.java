public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe","Sausage and Bacon",12.99,"Wheat");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("drinks",1.75);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add any more items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add any more items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add any more items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add any more items to deluxe burger");
    }
}
