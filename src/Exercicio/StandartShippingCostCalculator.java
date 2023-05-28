package Exercicio;

public class StandartShippingCostCalculator implements ShippingCostCalculator{

    @Override
    public double calculateShippingCost(Package pkg) {
        double peso = pkg.getPeso();
        if(peso < 5.0){
            return peso;
        }else if(peso <= 10.0){
            return peso*2;
        }else{
            return peso*3;
        }
    }
    
}
