package Teste2;

public class StandardOrderCostCalculator implements OrderCostCalculator{

    double price = 0;

    @Override
    public double calculateOrderCost(Order order) {
        for(Double item_price : order.getItems().values()){
            price = price+item_price;
        }
        if(order.getExpress_order()){
            return price*1.3;
        }else{
            return price;
        }
    }
   
}
