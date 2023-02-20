package aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int segundos,horas,horas_resto,minutos,minutos_resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere o tempo(s)!");
        segundos = sc.nextInt();
        sc.close();
        horas = segundos/3600;
        horas_resto = segundos%3600;
        minutos = horas_resto/60;
        minutos_resto = horas_resto%60;
        System.out.printf(segundos+" segundos corresponde a %02dh:%02dm:%02ds",horas,minutos,minutos_resto);
    }
}
