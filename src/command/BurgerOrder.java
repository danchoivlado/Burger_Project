package command;

public class BurgerOrder implements Order {
    private Chef chef;
    private String burgerType;

    public BurgerOrder(Chef chef, String burgerType) {
        this.chef = chef;
        this.burgerType = burgerType;
    }

    public void execute() {
        chef.prepareBurger(burgerType);
    }
}
