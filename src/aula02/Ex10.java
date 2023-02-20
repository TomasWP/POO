package aula02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex10 {
    public static void main(String[] args) {
        double primeiro_numero, numero,number = 0,media;
        ArrayList<Double> numeros = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor!");
        primeiro_numero = sc.nextDouble();
        numeros.add(primeiro_numero);
        do{
            System.out.println("Insira um valor!");
            numero = sc.nextDouble();
            numeros.add(numero);
        } while (numero != primeiro_numero);
        sc.close();
        double max = Collections.max(numeros);
        double min = Collections.min(numeros);
        for (double nmr : numeros){
            number += nmr;
        }
        media = number/numeros.size();
        System.out.println("O número máximo é "+max+"!");
        System.out.println("O número minimo é "+min+"!");
        System.out.println("A média dos números é "+media+"!");
    }
}
