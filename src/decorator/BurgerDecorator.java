package decorator;

public abstract class BurgerDecorator implements Burger {
    protected Burger decoratedBurger;

    public BurgerDecorator(Burger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
    }

    public String getDescription() {
        return decoratedBurger.getDescription();
    }

    public double getPrice() {
        return decoratedBurger.getPrice();
    }
}

