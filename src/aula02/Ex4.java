package aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double mi,mf,tx;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere o valor do montante investido!");
        mi = sc.nextDouble();
        System.out.println("Insere o valor da taxa de juro mensal!");
        tx = sc.nextDouble();
        sc.close();
        mf = mi;
        for (int i = 0; i<3; i++){
            mf += mf*(tx/100);
        }
        System.out.println("O valor do montante final após 3 meses é de "+mf+" €");
    }
}
