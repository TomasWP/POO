package Teste2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private int id;
    private String storeId;
    private String clientId;
    private LocalDate orderDateTime;
    private boolean express_order;
    private Map<String, Double> items;

    public Order(int orderID, String storeId, String clientId, LocalDate orderDateTime, boolean express_order){
        this.id = orderID;
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
        this.express_order = express_order;
        this.items = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public LocalDate getOrderDateTime() {
        return orderDateTime;
    }

    public boolean getExpress_order() {
        return express_order;
    }

    public Map<String, Double> getItems(){
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setOrderDateTime(LocalDate orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public void setExpress_order(boolean express_order) {
        this.express_order = express_order;
    }

    public void addItem(String produto, Double preco) {
        this.items.put(produto, preco);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", storeId='" + storeId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", orderDateTime=" + orderDateTime +
                ", express_order=" + express_order +
                ", items=" + items +
                '}';
    }
}
