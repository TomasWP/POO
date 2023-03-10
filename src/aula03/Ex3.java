package aula03;
import java.util.Scanner;
import Util.UserInput;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random_number = 0, number, counter = 0;
        String escolha = "s";
        try{
            System.out.println("Insira um número inteiro positivo de 1 a 100!");
            do{  
                if(counter == 0){
                    random_number = (int) (Math.random()*101)+1;
                }   
                do{
                    number = sc.nextInt();
                }while (UserInput.positivo(number) || !UserInput.in_between(number, 1, 100));
                counter++;
                if (number>random_number){
                    System.out.print("Alto! ");
                }else if(number<random_number){
                    System.out.print("Baixo! ");
                }else{
                    System.out.println("Acertou com "+counter+" tentativas! Se pretende continuar insira S ou Sim!");
                    escolha = sc.next();
                    counter = 0;
                }
            }while(escolha.equalsIgnoreCase("s") || escolha.equalsIgnoreCase("sim"));
        }catch(Exception e){
            System.out.print("Insira um número inteiro!");
        }
        sc.close();
    }
}
