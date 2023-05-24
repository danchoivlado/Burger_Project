package command;

public class Cashier {
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void takeOrder() {
        order.execute();
    }
}
