package aula05;
import Util.UserInput;

public class DateYMD {

    int day, month, year;

    public DateYMD(int day, int month, int year){

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static boolean valid(int day, int month, int year){

        if(validDay(day, month, year) && validMonth(month) && validYear(month)){
            return true;
        }else{
            System.out.println("Data inválida!");
            return false;
        }
    }
    public static boolean leapYear(int year){

        if ((year)%4 == 0 && year%100 != 0 && year%400 != 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean validDay(int day,int month, int year){

        if(UserInput.in_between(day, 1, monthDays(month, year))){
            return true;
        }else{
            return false;
        }
    }

    public static boolean validMonth(int month){

        if(UserInput.in_between(month, 1, 12)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean validYear(int year){

        if(!UserInput.positivo(year)){
            return true;
        }else{
            return false;
        }
    }

    public static int monthDays(int month, int year){

        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (leapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            default:   
                return 31;
        }
    }

    public void incrementDate(){
        if(this.day == monthDays(this.month, this.year) && this.month == 12){
            this.day = 1;
            this.month = 1;
            this.year++;
        }else if(this.day == monthDays(this.month, this.year)){
            this.day = 1;
            this.month++;
        }else{
            this.day++;
        }
    }

    public void decrementDate(){
        if(this.year != 0000 && this.month != 1 && this.day != 1){
            if(this.day == 1 && this.month == 1){
                this.day = 31;
                this.month = 12;
                this.year--;
            }else if(this.day == 1){
                this.day = monthDays(this.month-1, this.year);
                this.month --;
            }else{
                this.day--;
            }
        }
    }

    public String toString() {
        String output = Integer.toString(getYear())+"-"+Integer.toString(getMonth())+"-"+Integer.toString(day);
        return output;
    }
}
