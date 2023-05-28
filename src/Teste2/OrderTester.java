package Teste2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Map.Entry;

public class OrderTester {
    
    public static void main(String[] args) {
        OrderManager order_manager = new OrderManager();
        String file = "src/Teste2/pedidos.txt";
        boolean firstline = true;
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean run = true;
        int orderID = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        try {
            Scanner input = new Scanner(new FileReader(file));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                boolean status;
                if (!firstline) {
                    String[] data = line.split(";");
                    String storeId = data[1].trim();
                    String clientId = data[0].trim();
                    String[] composition = data[2].split("\\|");
                    LocalDate orderDateTime = LocalDate.parse(data[3].trim(),formatter);
                    String express_order =  (data[4].trim());
                    if(express_order.equals("expresso")){
                        status = true;
                    }else{
                        status = false;
                    }
                    orderID++;
                    Order order = new Order(orderID, storeId, clientId, orderDateTime, status);
                    for(int i = 0; i < composition.length; i++){
                        String[] item = composition[i].split(":");
                        order.addItem(item[0], Double.parseDouble(item[1]));
                    }
                    order_manager.addOrder(order);
                }else{
                    firstline = false;
                    continue;
                }
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error loading file "+ file);
        }

        do{
            do{
                System.out.println("Menu");
                System.out.println("1 - Add Order");
                System.out.println("2 - Remove Order");
                System.out.println("3 - Search Order");
                System.out.println("4 - Show all Orders");
                System.out.println("5 - Calculate Order Cost");
                System.out.println("6 - Calculate Order Cost for a month");
                System.out.println("0 - Quit");
                opcao = sc.nextInt();
            }while(opcao != 1 && opcao !=2 && opcao !=3 && opcao !=4 && opcao !=5 && opcao !=6 && opcao !=0);
    
            switch(opcao){
                case 1:
                    System.out.println("Store Id=");
                    String storeId = sc.next();
                    System.out.println("Client ID?");
                    String clientId = sc.next();
                    System.out.println("Express Order?");
                    boolean express_order = sc.nextBoolean();
                    Order order = new Order(orderID, storeId, clientId, LocalDate.now(), express_order);
                    order_manager.addOrder(order);
                    break;
                case 2:
                    System.out.println("Order ID?");
                    int remove_id = sc.nextInt();
                    order_manager.removeOrder(remove_id);
                    break;
                case 3:
                    System.out.println("Order ID?");
                    int search_id = sc.nextInt();
                    System.out.println(order_manager.searchOrder(search_id));
                    break;
                case 4:
                    order_manager.printAllOrders();
                    break;
                case 5:
                    System.out.println("Order ID?");
                    int calc_id = sc.nextInt();
                    System.out.println(order_manager.calculateOrderCost(calc_id));
                    break;
                case 6:
                    System.out.println("Month?");
                    //int month = sc.nextInt();
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }while(run);
        sc.close();

        try{
            String type;
            StringBuilder sb = new StringBuilder();
            FileWriter fileWriter = new FileWriter("src/Teste2/order_list.txt");
            fileWriter.write("Customer ID; Store ID; Order Composition; Order Date and Time; Type of order\n");
            fileWriter.write("\n");
            for (Order order : OrderManager.getOrders().values()) {
                sb.append(order.getClientId()+"; "+order.getStoreId()+"; ");
                for(Entry<String, Double> item : order.getItems().entrySet()){
                    sb.append(item.getKey()+" :"+item.getValue()+" | ");
                }
                if(order.getExpress_order()){
                    type = "Express";
                }else{
                    type = "Normal";
                }
                sb.append(order.getOrderDateTime()+"; "+type+"\n");
            }
            fileWriter.write(sb.toString());
            fileWriter.close();

        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo " + file + ": " + e.getMessage());
        }
    }
}
