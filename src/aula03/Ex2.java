package aula03;
import java.util.Scanner;
import Util.UserInput;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;     
            try{
                System.out.println("Insira um valor inteiro positivo!");
                number = sc.nextInt();
                if(!UserInput.positivo(number)){
                    for (int i = number; i>=0; i--){
                        if (i == 0){
                            System.out.print(i);
                        }else{
                            System.out.print(i+", ");
                        }
                    }
                }
            } catch(Exception e){
                System.out.println("ERRO! Insira um valor inteiro positivo!");
            }
            sc.close();
    }
}
