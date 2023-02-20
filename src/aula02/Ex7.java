package aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args) {
        int p1x,p1y,p2x,p2y;
        double distancia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere a coordenada x do primeiro ponto!");
        p1x = sc.nextInt();
        System.out.println("Insere a coordenada y do primeiro ponto!");
        p1y = sc.nextInt();
        System.out.println("Insere a coordenada x do segundo ponto!");
        p2x = sc.nextInt();
        System.out.println("Insere a coordenada y do segundo ponto!");
        p2y = sc.nextInt();
        sc.close();
        distancia = Math.sqrt(Math.pow(p2x-p1x,2)+Math.pow(p2y-p1y, 2));
        System.out.println("A distância entre os dois pontos é de "+distancia+"!");
    }
}
