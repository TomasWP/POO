package EP;

import java.time.LocalDate;

public class Rental {

    private LocalDate startDate, endDate;
    private StorageUnit unit;

    public Rental(StorageUnit unit, LocalDate starDate, LocalDate endDate){
        this.unit = unit;
        this.startDate = starDate;
        this.endDate = endDate;
    }

    public void setUnit(StorageUnit unit){
        this.unit = unit;
    }

    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate){
        this.endDate = endDate;
    }

    public StorageUnit getUnit() {
        return unit;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getendDate(){
        return endDate;
    }

    @Override
    public String toString(){
        return "Unit = "+unit+"\nStartDate = "+startDate+"\nEndDate = "+endDate;
    }
}
