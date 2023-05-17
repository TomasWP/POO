package aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EnergyUsageReport {

    private Map<Integer,Customer> customers;
    
    public EnergyUsageReport() {
        this.customers = new HashMap<>();
    }

    public void load(String string) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader(string));
        while(input.hasNextLine()){
            List<Integer> leituras = new ArrayList<>();
            String data = input.nextLine();
            String[] tokens = data.split("\\|");
            leituras.add(Integer.parseInt(tokens[1]));
            leituras.add(Integer.parseInt(tokens[2]));
            leituras.add(Integer.parseInt(tokens[3]));
            leituras.add(Integer.parseInt(tokens[4]));
            Customer customer = new Customer(Integer.parseInt(tokens[0]), leituras);
            this.customers.put(Integer.parseInt(tokens[0]), customer);
        }
        input.close();
    }

    public void addCustomer(Customer newCustomer) {
        customers.put(newCustomer.getCustomerId(), newCustomer);
    }

    public void removeCustomer(int id) {
        customers.remove(id);
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public Integer calculateTotalUsage(int id) {
        Customer customer = customers.get(id);
        Integer total = 0;
        for (Integer leitura : customer.getMeterReadings()) {
            total += leitura;
        }
        return total;
    }

    public void generateReport(String file){
        try {
            FileWriter fileWriter = new FileWriter(file);
            
            fileWriter.write("Relatorio de Consumo de Energia\n");
            fileWriter.write("-----------------------------\n");
            fileWriter.write("ID do Cliente | Energia Consumida\n");
            
            for (Customer customer : customers.values()) {
                fileWriter.write(customer.getCustomerId() + " | " + calculateTotalUsage(customer.getCustomerId())+"\n");
            }
            fileWriter.close();
            System.out.println("O relatório foi criado com sucesso no ficheiro: " + file);
        } catch(IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo " + file + ": " + e.getMessage());
        }
    }

    public void printAllCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }
}
