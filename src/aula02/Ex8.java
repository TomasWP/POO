package aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {
        double cateto_a,cateto_b,hipotenusa,angulo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Insere o valor do cateto A!");
            cateto_a = sc.nextDouble();
            System.out.println("Insere o valor do cateto B!");
            cateto_b = sc.nextDouble();
        } while(UserInput.positivo(cateto_a) || UserInput.positivo(cateto_b));
        sc.close();
        hipotenusa = Math.sqrt(Math.pow(cateto_a, 2)+Math.pow(cateto_b, 2));
        angulo = Math.toDegrees(Math.asin(cateto_b/hipotenusa));
        System.out.println("O valor da hipotenusa é "+hipotenusa+" e o seu ângulo com o cateto A é de "+angulo+"º !");
    }
}
