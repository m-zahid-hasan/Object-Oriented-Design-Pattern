import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse("Warehouse 1");
        Warehouse warehouse2 = new Warehouse("Warehouse 2");

        warehouse1.initializeStock("SKU1", 10);
        warehouse1.initializeStock("SKU2", 5);
        warehouse2.initializeStock("SKU1", 7);

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(warehouse1);
        warehouses.add(warehouse2);

        OrderFulfillmentProxy orderFulfillmentProxy = new OrderFulfillmentProxy(warehouses);

        Order order = new Order();
        order.itemList = new ArrayList<>();
        order.itemList.add(new Item());
        order.itemList.add(new Item());
        order.itemList.get(0).sku = "SKU1";
        order.itemList.get(1).sku = "SKU2";

        orderFulfillmentProxy.fulfillOrder(order);
    }
}
