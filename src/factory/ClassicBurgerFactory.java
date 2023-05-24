package factory;
import decorator.BasicBurger;
import decorator.Burger;

public class ClassicBurgerFactory implements BurgerFactory {
    public Burger createBurger() {
        return new BasicBurger();
    }
}
