

import java.util.List;

public class OrderFulfillmentProxy implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillmentProxy(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
        for (Warehouse warehouse : warehouses) {
            warehouse.fulfillOrder(order);
        }
    }
}
