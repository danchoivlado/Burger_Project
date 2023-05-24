import command.BurgerOrder;
import command.Cashier;
import command.Chef;
import command.Order;
import decorator.Burger;
import decorator.GarlicSauceDecorator;
import decorator.KetchupDecorator;
import factory.BurgerFactory;
import factory.RoyalBurgerFactory;
import singleton.Restaurant;

public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        Restaurant restaurant = Restaurant.getInstance();

        // Factory pattern
        BurgerFactory burgerFactory = new RoyalBurgerFactory();
        Burger burger = burgerFactory.createBurger();

        // Decorator pattern
        burger = new GarlicSauceDecorator(burger);
        burger = new KetchupDecorator(burger);

        System.out.println("Order details:");
        System.out.println("Burger: " + burger.getDescription());
        System.out.println("Price: $" + burger.getPrice());

        // Command pattern
        Chef chef = new Chef();
        Order burgerOrder = new BurgerOrder(chef, "Royal");
        Cashier cashier = new Cashier();
        cashier.setOrder(burgerOrder);
        cashier.takeOrder();
    }
}
