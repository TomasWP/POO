package aula07;
import java.time.LocalDate;

public class DateND extends Date{

    int days;

    public DateND(int days) {
        super();
        this.days = days;
    }

    public DateND(int day, int month, int year) {
        LocalDate jan1st2000 = LocalDate.of(2000, 1, 1);
        LocalDate date = LocalDate.of(year, month, day);
        this.days = (int) (date.toEpochDay() - jan1st2000.toEpochDay());
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    public void incrementDate() {
       this.days++;
    }

    public void decrementDate() {
        this.days--;
    }

    @Override
    public String toString() {
        LocalDate jan1st2000 = LocalDate.of(2000, 1, 1);
        LocalDate date = jan1st2000.plusDays(days);
        return String.format("%02d/%02d/%04d", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }
    
}
