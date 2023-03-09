package aula04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Util.UserInput;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        System.out.println("distancia_Drive"+distance);
        this.kms += distance;
    }

    public String getMake() {
        return make;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {

        String[] input = {}, marca = {};
        String frase;
        boolean bool = true;
        int numcars = 0;
        do{
            try{
                for(int i = 0; i<10; i++){
                    do{
                        System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
                        frase = sc.nextLine();
                        if(frase.equals("")){
                            break;
                        }
                        input = frase.split(" ");
                        if(UserInput.is_numeric(input[0]) || UserInput.positivo(Integer.parseInt(input[input.length-1])) || !(input[input.length-2].length() == 4) || !UserInput.in_between((Integer.parseInt(input[input.length-2])), 0000, 9999)){
                            System.out.println("Dados mal formatados. Tente novamente.");
                        }
                    }while(UserInput.is_numeric(input[0]) || UserInput.positivo(Integer.parseInt(input[input.length-1])) || !(input[input.length-2].length() == 4) || !UserInput.in_between((Integer.parseInt(input[input.length-2])), 0000, 9999));

                    if(frase.equals("")){
                        break;
                    }else if(input[0].contains("-")){
                        marca = input[0].split("-");
                        input[0] = marca[0];
                    }
                    numcars++;
                    List<String> list = new ArrayList<String>(Arrays.asList(input));
                    list.remove(0);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    String model = String.join(" ", list);
                    cars[i] = new Car(input[0], model,Integer.parseInt(input[input.length-2]), Integer.parseInt(input[input.length-1]));
                }
                bool = false;

            }catch(Exception e){
                System.out.println("Dados inválidos!");
            }
        }while(bool);
        bool = false;
        return numcars;
   }

    static void registerTrips(Car[] cars, int numCars) {
        String input;
        String[] dados;
        boolean bool = true;
        do{
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            input = sc.nextLine();
            if(input.equals("")){
                bool = false;
            }else if(input.contains(":")){
                dados = input.split(":");
                if(UserInput.is_numeric(dados[0]) && UserInput.in_between(Integer.parseInt(dados[0]), 0, numCars-1) && UserInput.is_numeric(dados[1]) && !UserInput.positivo(Integer.parseInt(dados[1]))){
                    cars[Integer.parseInt(dados[0])].drive(Integer.parseInt(dados[1]));
                    System.out.println("Registado com sucesso!");
                }else{
                    System.out.println("Dados mal formatados. Tente novamente.");
                }
            }else{
                System.out.println("Dados mal formatados. Tente novamente.");
            }
        }while(bool);
    }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        for(Car carro: cars){
            if(carro == null){
                break;
            }else{
                System.out.println(carro);
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}