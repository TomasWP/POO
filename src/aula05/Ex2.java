package aula05;
import Util.UserInput;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao, contador = 0, month;
        String frase = "";
        String[] input = {};
        boolean bool;
        DateYMD new_date;
        Calendar calendar = new Calendar(0, 0);
        try{
            do{
                do{
                    System.out.println("");
                    System.out.println("Calendar operations:");
                    System.out.println("1 - Create new calendar");
                    System.out.println("2 - Create new event");
                    System.out.println("3 - Remove event");
                    System.out.println("4 - Print calendar month");
                    System.out.println("5 - Print calendar");
                    System.out.println("0 - Exit");
                    opcao = sc.nextInt();
                }while(!UserInput.in_between(opcao, 0, 5));

                switch(opcao){

                    case 1:
                        
                        do{
                            System.out.println("");
                            System.out.println("Insira os dados no formato D-AAAA (Dia da semana em que o ano começa 1-Sunday...7-Saturday, AAAA-Ano)!");
                            frase = sc.next();
                            input = frase.split("-");
                            if(input[1].length()!=4){
                                System.out.println("ERRO!Insira a data no formato pretendido AAAA!");
                            }
                            bool = !UserInput.in_between(Integer.parseInt(input[0]), 1, 7);
                        }while(frase == "" || bool || input[1].length()!=4);
                            calendar = new Calendar(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
                            contador++;
                            break;

                    case 2:
                        if(contador <= 0){
                            System.out.println("ERRO! Nenhum calendário criado!");
                            break;
                        }else{
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
                                Calendar.addEvent(new_date);
                            break;
                        }

                    case 3:
                        if(contador <= 0){
                            System.out.println("ERRO! Nenhum calendário criado!");
                            break;
                        }else{
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
                                Calendar.removeEvent(new_date);
                            break;
                        }

                    case 4: 
                        if(contador <= 0){
                            System.out.println("ERRO! Nenhum calendário criado!");
                            break;
                        }else{
                            do{
                                System.out.println("Insira o mês(1-January...12-December)");
                                month = sc.nextInt();
                            }while(!UserInput.in_between(month, 1, 12));
                            System.out.println(calendar.printMonth(month));
                            break;
                        }
                    case 5:
                        System.out.println(calendar.toString());
                        break;

                    default:
                        break;

                }
            }while(opcao!=0);

            
            sc.close();
        }catch(Exception e){
            System.out.println("ERRO! Insira um número inteiro!");
        }
    }
}
