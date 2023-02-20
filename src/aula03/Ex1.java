package aula03;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Ex1 {
    public static void main(String[] args) {
        double notaP,notaT,nota_final;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.0");
        do {
            System.out.println("Insira a nota da componente prática(0-20)!");
            notaP = sc.nextDouble();
            System.out.println("Insira a nota da componente teórica(0-20)!");
            notaT = sc.nextDouble();
        } while ((notaP >20 || notaT >20) || (notaP <0) ||(notaT <0));
        sc.close();
        df.format(notaP);
        df.format(notaT);
        if (notaP < 7 || notaT < 7){
            System.out.println("66! Reprovado por nota minima!");
        } else {
            nota_final = 0.4*notaT + 0.6*notaP;
            System.out.println("A sua nota final é de "+Math.round(nota_final)+"!");
        }
    }
}
