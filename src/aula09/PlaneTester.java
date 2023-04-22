package aula09;
import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.print("Enter the plane ID: ");
        String planeId = scanner.next();

        System.out.print("Enter the manufacturer: ");
        String planeManufacturer = scanner.next();

        System.out.print("Enter the model: ");
        String planeModel = scanner.next();

        System.out.print("Enter the year: ");
        int planeYear = scanner.nextInt();

        System.out.print("Enter the plane type (C for commercial, M for military): ");
        char planeType = scanner.next().toLowerCase().charAt(0);

        System.out.print("Enter the number of passengers: ");
            int numPassengers = scanner.nextInt();

        System.out.print("Enter the maximum speed (km/h): ");
        int maxSpeed = scanner.nextInt();

        if (planeType == 'c') {
            System.out.print("Enter the crew members: ");
        int crewMembers = scanner.nextInt();

            CommercialPlane newPlane = new CommercialPlane(planeId, planeManufacturer, planeModel, planeYear, numPassengers, maxSpeed, crewMembers );
            planeManager.addPlane(newPlane);
            System.out.println("Commercial plane with ID " + planeId + " added to fleet.");
        } else if (planeType == 'm') {
            System.out.print("Enter the number of ammunition: ");
            int numEngines = scanner.nextInt();

            MilitaryPlane newPlane = new MilitaryPlane(planeId, planeManufacturer, planeModel, planeYear, numPassengers, maxSpeed, numEngines);
            planeManager.addPlane(newPlane);
            System.out.println("Military plane with ID " + planeId + " added to fleet.");
        } else {
            System.out.println("Invalid plane type. Please try again.");
        }
    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        System.out.print("Enter the plane ID: ");
        String planeId = scanner.next();

        boolean removed = planeManager.removePlane(planeId);

        if (removed) {
            System.out.println("Plane with ID " + planeId + " removed.");
        } else {
            System.out.println("Plane with ID " + planeId + " not found.");
        }
    }
    
    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.print("Enter the plane ID: ");
        String id = scanner.next();
        Plane plane = planeManager.searchPlane(id);
        if (plane != null) {
            System.out.println("Plane found:");
            System.out.println(plane.toString());
        } else {
            System.out.println("Plane not found.");
        }
    }
    
    private static void printAllPlanes(PlaneManager planeManager) {
        System.out.println("Summary of all planes in the fleet:");
        planeManager.printAllPlanes();
    }
    
    private static void printCommercialPlanes(PlaneManager planeManager) {
        System.out.println("List of all commercial planes in the fleet:");
        if(!planeManager.getCommercialPlanes().isEmpty()){
            for (Plane plane : planeManager.getCommercialPlanes()) {
                System.out.println(plane.toString());
            }
        }else{
            System.out.println("No planes in the fleet.");
        }
    }
    
    private static void printMilitaryPlanes(PlaneManager planeManager) {
        System.out.println("List of all military planes in the fleet:");
        if(!planeManager.getMilitaryPlanes().isEmpty()){
            for (Plane plane : planeManager.getMilitaryPlanes()) {
                System.out.println(plane.toString());
            }
        }else{
            System.out.println("No planes in the fleet.");
        }
    }
    
    private static void printFastestPlane(PlaneManager planeManager) {
        System.out.println("Fastest plane in the fleet:");
        Plane fastestPlane = planeManager.getFastestPlane();
        if (fastestPlane != null) {
            System.out.println(fastestPlane.toString());
        } else {
            System.out.println("No planes in the fleet.");
        }
    }
}
