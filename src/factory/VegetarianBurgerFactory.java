package factory;

import decorator.BasicBurger;
import decorator.Burger;

public class VegetarianBurgerFactory implements BurgerFactory {
    public Burger createBurger() {
        return new BasicBurger();
    }
}
