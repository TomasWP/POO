package aula11;
import java.util.Arrays;
import java.io.IOException;

public class EnergyUsageReportTester {

    public static void main(String[] args) throws IOException {
        
        // Create an instance of the EnergyUsageReport class
        EnergyUsageReport energyReport = new EnergyUsageReport();
        
        // Load the customer data from a text file using the load() method
        try{
            energyReport.load("clients.txt");
        } catch (IOException e){
            System.out.println("Error loading file: " + e.getMessage());
        }
        
        // Add one or more customers to the collection using the addCustomer() method
        Customer newCustomer = new Customer(9992, Arrays.asList(1500, 2000, 2500, 3000));
        energyReport.addCustomer(newCustomer);
        
        // Remove one or more customers from the collection using the removeCustomer() method
        energyReport.removeCustomer(1015);
        
        // Retrieve a customer from the collection using the getCustomer() method
        Customer retrievedCustomer = energyReport.getCustomer(1025);
        System.out.println(retrievedCustomer);
        
        // Calculate the total energy usage for a specific customer using the calculateTotalUsage() method
        Integer totalEnergyUsage = energyReport.calculateTotalUsage(1003);
        System.out.println("Total energy usage for customer 1003: " + totalEnergyUsage);
        
        // Generate a report of all customers and their total energy usage using the generateReport() method
        energyReport.generateReport("energy_report.txt");
    }
}
