package aula03;
import java.util.Scanner;
import Util.UserInput;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montante_final, montante_inicial, taxa;
        boolean bool = true;
        try{
            System.out.println("Insira o montante investido (positivo e múltiplo de 1000)!");
            do{
                montante_inicial = sc.nextDouble();
                bool = UserInput.positivo(montante_inicial) && !UserInput.is_multiple(montante_inicial, 1000);
            }while (bool);
            System.out.println("Insira a taxa de juro mensal entre 0 a 5% !");
            do{
                taxa = sc.nextDouble();
                bool = !UserInput.in_between(taxa, 0, 5);
            }while (bool);

            montante_final = montante_inicial;
            for (int i = 1; i<=12; i++){
                montante_final = montante_final + montante_final*(taxa/100);
                System.out.println("O valor do fundo no "+i+"º mês é de "+montante_final+"€");
            }
        } catch (Exception e){
            System.out.println("Insira um número inteiro!");
        }
        sc.close();
    }
}
