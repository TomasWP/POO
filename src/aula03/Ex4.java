package aula03;
import Util.UserInput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int numero_alunos = 0;
        double notas[][];
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
       try{
            System.out.println("Insira o número de alunos da turma!");
            while (bool){
                numero_alunos = sc.nextInt();
                bool = UserInput.positivo(numero_alunos);
            }
            notas = new double[2][numero_alunos];
            System.out.println(notas.length);
            for (int i = 0; i<notas.length; i++){
                for (int j = 0; j<notas[i].length; j++){
                    notas [i][j] = Math.random()*20.1;
                }
            }
            System.out.printf("%5s %7s %7s\n","NotaT","NotaP","Pauta\n");
            for (int i = 0; i<notas[0].length; i++){
                System.out.printf("%5.1f %7.1f %6d\n",notas[0][i],notas[1][i],UserInput.nota_final(notas[0][i], notas[1][i]));
            }
        }catch(Exception e){
            System.out.println("Insira um valor inteiro!");
        }
        sc.close();
    }
}
