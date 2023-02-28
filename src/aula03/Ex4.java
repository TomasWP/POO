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
            notas = new double[numero_alunos][numero_alunos];
            for (int i = 0; i<notas.length; i++){
                for (int j = 0; j<notas[i].length; j++){
                    notas [i][j] = Math.random()*20;
                }
            }
            System.out.printf(" %1s    %1s    %s","NotaT","NotaP","Pauta\n");
            for (int i = 0; i<notas[0].length; i++){
                System.out.printf("  %.1f      %.1f      %d\n",notas[0][i],notas[1][i],UserInput.nota_final(notas[0][i], notas[1][i]));
            }
        }catch(Exception e){
            System.out.println("Insira um valor inteiro!");
        }
        sc.close();
    }
}
