package aula02;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor!");
        n = sc.nextInt();
        sc.close();
        if (n>0) {
            for(int i = n;i>=0;i--){
                if (i%10 == 0){
                    if (i == 0){
                        System.out.print("\n"+i);
                    } else{
                        System.out.printf("\n"+i+",");
                    }
                } else{
                    if((i-1) % 10 == 0){
                        System.out.print(i);
                    } else{
                        System.out.printf(i+",");
                    }
                }
            }
        } else if (n<0){
            for(int i = n;i<=0;i++){
                if (i%10 == 0){
                    if (i == 0){
                        System.out.print("\n"+i);
                    } else{
                        System.out.printf("\n"+i+",");
                    }
                } else{
                    if((i+1) % 10 == 0){
                        System.out.print(i);
                    } else{
                        System.out.printf(i+",");
                    }
                }
            }
        } else{
            System.out.println(n);
        }
    }
}
