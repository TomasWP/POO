package aula03;
import java.util.Scanner;
import Util.UserInput;

public class Ex3 {
    public static void main(String[] args) {
        int number;
        boolean numero_primo = false, bool = true;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Insira um número inteiro positivo!");
            while(bool){
                number = sc.nextInt();
                if (!UserInput.positivo(number)){
                    for (int i = 2; i < 10; i++){
                        if (number%i == 0 && number != i){
                            numero_primo = true;
                            break;
                        }
                    }
                    if(numero_primo){
                        System.out.println("O número "+number+" não é um número primo!");
                    } else{
                        System.out.println("O número "+number+" é um número primo!");
                    }
                    bool = false;
                }
            }
            
        } catch (Exception e){
            System.out.println("Insira um número inteiro!");
        }
        sc.close();
    }
}
