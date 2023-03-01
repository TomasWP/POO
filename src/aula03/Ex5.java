package aula03;

import java.util.Scanner;

import Util.UserInput;

public class Ex5 {
    public static void main(String[] args) {
        try{
            int values[] = read_values();
            print_calendar(values[0], values[1], values[2]);
        }catch(Exception e){
            System.out.println("Insira um valor inteiro!");
        }
    }

    public static int[] read_values(){
            Scanner sc = new Scanner(System.in);
            int year = 0, month = 0, week_day = 0;
            System.out.println("Insira o ano!");
            do{
                year = sc.nextInt();
            }while(UserInput.positivo(year));

            System.out.println("Insira o mês!");
            do{
                month = sc.nextInt();
            }while(!UserInput.in_between(month, 1, 12));

            System.out.println("Insira o dia da semana em que começa esse mês!");
            do{
                week_day = sc.nextInt();
            }while(!UserInput.in_between(week_day, 1, 7));
            int values[] = {week_day,month,year};
            sc.close();
            return values;
    }

    public static int days_in_month(int month,int year){
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((year)%4 == 0 && year%100 != 0 && year%400 != 0){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return 31;
        }
    }

    public static String month_name(int month){
        switch (month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			default: return "December";
		}
    }
    public static void print_calendar(int week_day, int month, int year){
        int days = days_in_month(month, year);
        String title = month_name(month)+" "+Integer.toString(year);
        int padding = (20-title.length())/2;
        System.out.println(padding);
        String padding_space = "";
        for(int i =0; i<padding; i++){
            padding_space += " ";
        }
        title = padding_space+month_name(month)+" "+Integer.toString(year);
        System.out.println(title);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for(int i = 0; i<week_day;i++){
                System.out.print("   ");
        }
        for (int i = 1; i <= days; i++) {
			System.out.printf("%2d ", i);
			if ((i + week_day) % 7 == 0){
                System.out.println();
            }
		}
    }
}
