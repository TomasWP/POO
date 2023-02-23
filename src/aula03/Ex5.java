package aula03;
import java.util.Scanner;
import Util.UserInput;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        String frase;
        String[] data;
        try{
            do{
                System.out.println("Insira a data(MM-AAAA)!");
                frase = sc.nextLine();
                data = frase.split("-");
                if (!(UserInput.positivo(Integer.parseInt(data[0]))) && (!UserInput.positivo(Integer.parseInt(data[1]))) && (UserInput.in_between(Integer.parseInt(data[0]),1, 12))){
                    bool = false;
                }
            } while(bool);
            switch(Integer.parseInt(data[0])){
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("O mês tem "+30+" dias!");
                    break;
                case 2:
                    if ((Integer.parseInt(data[1])%4 == 0) && (Integer.parseInt(data[1])%100 != 0 && (Integer.parseInt(data[1])%400 != 0))){
                        System.out.println("O mês tem "+29+" dias!");
                    }else{
                        System.out.println("O mês tem "+28+" dias!");
                    }
                    break;
                default:
                    System.out.println("O mês tem "+31+" dias!");
                    break;
            }
        } catch(Exception e){
            System.out.println("Insira um número inteiro!");
        }
        sc.close();
    }
}
