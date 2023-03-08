package aula04;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    ArrayList<Product> produtos = new ArrayList<Product>();

    public void addProduct(Product objeto){
        produtos.add(objeto);
    }

    
    public String toString() {
        String output = String.format("%7s %13s %11s %11s","Product","Price","Quantity","Total\n");
        output += "\n";
        double total_value = 0;
        for(Product objeto: produtos){
            total_value += objeto.getTotalValue();
            output += String.format("%-10s %10.2f %11d %10.2f\n",objeto.getName(),objeto.getPrice(),objeto.getQuantity(),objeto.getTotalValue());
        }
        output += "\n";
        output += ("Total value: "+total_value);

        return output;
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));


        System.out.println(cr);

    }
}