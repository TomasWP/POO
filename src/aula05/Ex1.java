package aula05;
import java.util.Scanner;

import Util.UserInput;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao, contador = 0;
        String frase = "";
        String[] input = {};
        DateYMD new_date = new DateYMD(0, 0, 0);

        try{
            do{
                do{
                    System.out.println("");
                    System.out.println("Date operations:");
                    System.out.println("1 - Create new date");
                    System.out.println("2 - Show current date");
                    System.out.println("3 - Increment date");
                    System.out.println("4 - Decrement date");
                    System.out.println("0 - Exit");
                    opcao = sc.nextInt();
                }while(!UserInput.in_between(opcao, 0, 4));

                switch(opcao){

                    case 1:
                        do{
                            System.out.println("");
                            System.out.println("Insira a data no formato DD-MM-AAAA!");
                            frase = sc.next();
                            input = frase.split("-");
                            if(input[1].length()!=2){
                                System.out.println("ERRO!Insira a data no formato pretendido MM!");
                            }else if(input[2].length()!=4){
                                System.out.println("ERRO!Insira a data no formato pretendido AAAA!");
                            }
                        }while(frase == "" || input[1].length()!=2 || input[2].length()!=4 || !DateYMD.valid(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                            new_date = new DateYMD(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                            contador++;
                            break;

                    case 2:
                        if (contador == 0) {
                            System.out.println("Nenhuma data foi criada!");
                            break;
                        }
                        System.out.println("");
                        System.out.println("Data atual: \n" + new_date.toString());
                        break;

                    case 3:
                        new_date.incrementDate();
                        break;

                    case 4:
                        new_date.decrementDate();
                        break;

                    default:
                        break;

                }
            }while(opcao != 0);

            sc.close();

        }catch(Exception e){
            System.out.println("ERRO! Insira um número inteiro!");
        }
    }
}
