package aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere o valor em Celsius que pretende converter!");
        celsius = sc.nextDouble();
        sc.close();
        fahrenheit = 1.8*celsius+32;
        System.out.println("O valor em Fahrenheit é: "+fahrenheit+" ºF");
    }
}
