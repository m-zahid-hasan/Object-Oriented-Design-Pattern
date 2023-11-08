

import java.util.Hashtable;

public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.address = address;
        stock = new Hashtable<>();
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            if (stock.containsKey(item.sku) && stock.get(item.sku) > 0) {
                stock.replace(item.sku, stock.get(item.sku) - 1);
            } else {
                System.out.println("Item " + item.sku + " is out of stock in " + address);
            }
        }
        // Process the order for shipment and delivery code
        System.out.println("Order fulfilled by Warehouse: " + address);
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku);
        return 0;
    }

    public void initializeStock(String sku, int quantity) {
        stock.put(sku, quantity);
    }
}
