package Exercicio;

import java.util.HashMap;
import java.util.Map;

public class PackageManager{
    
    private Map<Integer, Package> packages;
    private ShippingCostCalculator shippingCostCalculator;
    
    public PackageManager(){
        this.packages = new HashMap<>();
        this.shippingCostCalculator = new StandartShippingCostCalculator();
    }

    public void addPackage(Package pkg){
        packages.put(pkg.getId(), pkg);
    }

    public void removePackage(int id){
        packages.remove(id);
    }

    public Package searchPackage(int id){
        return packages.get(id);
    }

    public double calculateShippingCost(int id){
        Package pkg = packages.get(id);
        if(pkg == null){
            return -1;
        }else{
            return shippingCostCalculator.calculateShippingCost(pkg);
        }
    }

    public Map<Integer, Package> getPackages() {
        return packages;
    }

    public void printAllPackages(){
        for(Package pkg : packages.values()){
            System.out.println("ID = "+pkg.getId()+" Encomenda = "+pkg);
        }
    }
}
