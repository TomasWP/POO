package Teste2;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private static Map<Integer, Order> orders;
    private OrderCostCalculator orderCostCalculator;
    
    public OrderManager(){
        OrderManager.orders = new HashMap<>();
    }

    public void addOrder(Order order){
        orders.put(order.getId(), order);
    }

    public void removeOrder(int id){
        orders.remove(id);
    }

    public Order searchOrder(int id){
        return orders.get(id);
    }

    public double calculateOrderCost(int id){
        Order order = orders.get(id);
        if(order == null){
            return -1;
        }else{
            return orderCostCalculator.calculateOrderCost(order);
        }
    }

    public static Map<Integer, Order> getOrders(){
        return orders;
    }

    public void printAllOrders(){
        System.out.println("order size"+orders.size());
        for(Order order : orders.values()){
            System.out.println("ID = "+order.getId()+" Order = "+order);
        }
    }
}
