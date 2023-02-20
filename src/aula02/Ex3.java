package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double M,TI,TF,Q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere a massa(Kg) da água pretende aquecer!");
        M = sc.nextDouble();
        System.out.println("Insere a temperatura inicial da água!");
        TI = sc.nextDouble();
        System.out.println("Insere a temperatura final a que pretende que a água esteja!");
        TF = sc.nextDouble();
        sc.close();
        Q = M*(TF-TI)*4184;
        System.out.println("A energia necessária para aquecer a água será de "+Q+" J");
    }
}
