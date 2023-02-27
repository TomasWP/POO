package aula03;
import java.util.Scanner;
import Util.UserInput;

public class Ex1 {
    public static void main(String[] args) {
        boolean bool = true;
        Scanner sc = new Scanner(System.in);
        int number = 0,soma;
        try{
            System.out.println("Insira um número inteiro positivo!");
            while (bool){
                number = sc.nextInt();
                bool = UserInput.positivo(number);
            }
            soma = number;
            for(int i = number-1; i>0; i--){
                if(UserInput.primo(i)){
                    soma += i;
                }
            }
            System.out.println("A soma de todos os número primos até ao número "+number+" inclusive é "+soma+"!");
        }catch(Exception e){
            System.out.println("Insira um valor inteiro!");
        }
        sc.close();
    }
}
