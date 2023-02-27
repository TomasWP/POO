package aula03;
import Util.UserInput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int numero_alunos;
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        try{
            System.out.println("Insira o número de alunos da turma!");
            while (bool){
                numero_alunos = sc.nextInt();
                bool = UserInput.positivo(numero_alunos) || !UserInput.in_between(numero_alunos, 0.0, 20.0);
            }
        }catch(Exception e){
            System.out.println("Insira um valor inteiro!");
        }
        sc.close();
    }
}
