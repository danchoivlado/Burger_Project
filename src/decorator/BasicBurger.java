package decorator;

public class BasicBurger implements Burger {
    public String getDescription() {
        return "Basic Burger";
    }

    public double getPrice() {
        return 3.99;
    }
}

