package aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double km,ml;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere o valor que pretende converter de Km para Milhas!");
        km = sc.nextDouble();
        ml =km/1.609;
        System.out.printf("O valor em milhas é %.2f ",ml);
        sc.close();
    }
}