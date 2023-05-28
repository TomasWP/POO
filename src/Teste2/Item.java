package Teste2;

public class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + '}';
    }
// q: como posso iterar por um hashmap em java?
}
