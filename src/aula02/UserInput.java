package aula02;

public class UserInput {
    static boolean positivo(double number){
        if (number<0){
            System.out.println("Insira um valor positivo!\n");
            return true;
        } else{
            return false;
        }
    }
}
