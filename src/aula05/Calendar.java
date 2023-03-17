package aula05;

public class Calendar {

    int firstWeekdayOfYear;
    static int year;
    static int events[][] = new int[12][];

    public Calendar(int firstWeekdayOfYear, int year){
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        Calendar.year = year;
        for (int i = 1; i <= events.length; i++) {
            int days_in_month = DateYMD.monthDays(i,Calendar.year);
            events[i-1] = new int[days_in_month];
        }
    }

    public static int[][] getEvents() {
        return events;
    }

    public int getfirstWeekdayOfYear() {
        return firstWeekdayOfYear;
    }

    public static int getYear() {
        return year;    
    }

    public int getfirstWeekdayOfMonth(int month){
        int total_dias_anteriores = 0;
        for (int i = 1; i < month; i++) {
            total_dias_anteriores += DateYMD.monthDays(i , Calendar.year);
        }
        int day_of_week = (this.firstWeekdayOfYear + total_dias_anteriores) % 7;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        return day_of_week;
    }

    public static void addEvent(DateYMD object){
        int month = object.getMonth();
        int day = object.getDay();
        int year = object.getYear();
        if(year == Calendar.getYear()){
            events[month-1][day-1]++;
            System.out.println("Evento adicionado!");
        }else{
            System.out.println("ERRO! Ano não corresponde ao calendário atual!");
        }

    }

    public static void removeEvent(DateYMD object){
        int month = object.getMonth();
        int day = object.getDay();
        if(year == Calendar.getYear()){
            if(events[month-1][day-1] > 0){
                events[month-1][day-1]--;
                System.out.println("Evento removido!");
            }else{
                System.out.println("ERRO!Dia não possui nenhum evento!");
            }
        }else{
            System.out.println("ERRO! Ano não corresponde ao calendário atual!");
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

    public String printMonth(int month){
        StringBuilder output = new StringBuilder();
        int days = DateYMD.monthDays(month, getYear());
        String title = month_name(month)+" "+Integer.toString(getYear());
        int padding = (36-title.length())/2;
        output.append("\n");
        String padding_space = "";
        for(int i =0; i<padding; i++){
            padding_space += " ";
        }
        title = padding_space+month_name(month)+" "+Integer.toString(year);
        output.append(title+"\n");
        output.append(String.format("%4s %4s %4s %4s %4s %4s %5s","Su","Mo","Tu","We","Th","Fr","Sa\n"));
        for(int i = 1; i<getfirstWeekdayOfMonth(month);i++){
            output.append("     ");
        }
        for (int i = 1; i <= days; i++) {
            //System.out.println(i);
            if(events[month-1][i-1] > 0){
                output.append(String.format("%4s", "*"+Integer.toString(i)));
            }else{
                output.append(String.format("%4d ", i));
            }
			if ((i-1 + getfirstWeekdayOfMonth(month)) % 7 == 0){
                output.append("\n");
            }
		}
        return output.toString();
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            output.append(printMonth(i));
            output.append("\n");
        }
        return output.toString();
    }
}
