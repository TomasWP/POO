package Exercicio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PackagingTester {
    public static void main(String[] args) {
        PackageManager packageManager = new PackageManager();
        String file = "src/Exercicio/encomendas.txt";
        boolean firstline = true;

        try {
            Scanner input = new Scanner(new FileReader(file));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (!firstline) {
                    String[] data = line.split(";");
                    Integer id = Integer.parseInt(data[0].trim());
                    double peso = Double.parseDouble(data[1].trim());
                    String remetente = data[2].trim();
                    String destino = data[3].trim();
                    Package pkg = new Package(id, peso, remetente,destino);
                    packageManager.addPackage(pkg);
                }else{
                    firstline = false;
                    continue;
                }
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error loading file "+ file);
        }


        System.out.println(packageManager.searchPackage(24));
        System.out.println(packageManager.searchPackage(32));
        packageManager.removePackage(24);
        System.out.println(packageManager.searchPackage(24));
        packageManager.printAllPackages();
        System.out.println(packageManager.calculateShippingCost(25));
        System.out.println(packageManager.calculateShippingCost(2));
        System.out.println(packageManager.calculateShippingCost(9));

        try{
            FileWriter fileWriter = new FileWriter("src/Exercicio/lista_encomendas.txt");
            fileWriter.write("Remetente; Destino; Peso da encomenda; Preço da encomenda\n");
            fileWriter.write("\n");
            for (Package pkg : packageManager.getPackages().values()) {
                fileWriter.write(pkg.getRemetente()+"; "+pkg.getDestino()+"; "+pkg.getPeso()+"; "+packageManager.calculateShippingCost(pkg.getId())+"\n");
            }
            fileWriter.close();

        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo " + file + ": " + e.getMessage());
        }
    }
}
