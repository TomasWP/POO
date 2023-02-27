package Util;

public class UserInput {
    public static boolean positivo(double number){
        if (number<0){
            System.out.println("Insira um valor positivo!\n");
            return true;
        } else{
            return false;
        }
    }

    public static boolean positivo(int number){
        if (number<0){
            System.out.println("Insira um valor positivo!\n");
            return true;
        } else{
            return false;
        }
    }

    public static boolean is_multiple(int number, int multiple_number){
        if (number%multiple_number == 0){
            return true;
        } else{
            System.out.println("Insira um valor múltiplo de "+multiple_number+"!");
            return false;
        }
    }

    public static boolean in_between(int number, int minimum_number, int maximum_number){
        if ((number<=maximum_number) && (minimum_number<=number)){
            return true;
        } else{
            System.out.println("O número "+number+" não se encontra entre "+minimum_number+" e "+maximum_number+"!");
            return false;
        }
    }

    public static boolean is_multiple(double number, double multiple_number){
        if (number%multiple_number == 0){
            return true;
        } else{
            System.out.println("Insira um valor múltiplo de "+multiple_number+"!");
            return false;
        }
    }

    public static boolean in_between(double number, double minimum_number, double maximum_number){
        if ((number<=maximum_number) && (minimum_number<=number)){
            return true;
        } else{
            System.out.println("O número "+number+" não se encontra entre "+minimum_number+" e "+maximum_number+"!");
            return false;
        }
    }
    public static boolean primo(int number){
        for (int i = 2; i < 10; i++){
            if (number%i == 0 && number != i){
                return false;
            }
        }
        return true;
    }

    public static int nota_final(double nota_teorica, double nota_pratica){
        if (nota_pratica < 7 || nota_teorica < 7){
            return 66;
        } else {
            double  nota_final = 0.4*nota_teorica + 0.6*nota_pratica;
            return (int) Math.round(nota_final);
        }
    }
}
