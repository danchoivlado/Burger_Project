package decorator;

public class GarlicSauceDecorator extends BurgerDecorator {
    public GarlicSauceDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public String getDescription() {
        return decoratedBurger.getDescription() + ", Garlic Sauce";
    }

    public double getPrice() {
        return decoratedBurger.getPrice() + 0.5;
    }
}
