package decorator;

public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public String getDescription() {
        return decoratedBurger.getDescription() + ", Ketchup";
    }

    public double getPrice() {
        return decoratedBurger.getPrice() + 0.25;
    }
}

