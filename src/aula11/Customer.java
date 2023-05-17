package aula11;
import java.util.List;

public class Customer {
    private int customerId;
    private List<Integer> meterReadings;

    public Customer(int customerId, List<Integer> meterReadings) {
        this.customerId = customerId;
        this.meterReadings = meterReadings;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Integer> getMeterReadings() {
        return meterReadings;
    }

    public void setMeterReadings(List<Integer> meterReadings) {
        this.meterReadings = meterReadings;
    }

    @Override
    public String toString() {
        return this.customerId+" = "+this.getMeterReadings().toString();
    }
}
