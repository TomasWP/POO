package aula02;
import java.util.Scanner;
import Util.UserInput;

public class Ex5 {
    public static void main(String[] args) {
        double v1,d1,v2,d2,vm,t1,t2;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Insere a velocidade(m/s) do primeiro trajeto!");
            v1 = sc.nextDouble();
            System.out.println("Insere a distância(m) do primeiro trajeto!");
            d1 = sc.nextDouble();
            System.out.println("Insere a velocidade(m/s) do segundo trajeto!");
            v2 = sc.nextDouble();
            System.out.println("Insere a distância(m) do segundo trajeto!");
            d2 = sc.nextDouble();
        } while(UserInput.positivo(v1) || UserInput.positivo(d1) || UserInput.positivo(v2) || UserInput.positivo(d2));
        sc.close();
        t1 = d1/v1;
        t2 = d2/v2;
        vm = (d1+d2)/(t1+t2);
        System.out.println("A velocidade média final é de "+vm+" m/s");
    }
}
