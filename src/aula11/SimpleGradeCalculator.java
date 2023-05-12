package aula11;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator{

    public double calculate(List<Double> grades) {
        double media = 0;
        for (Double grade : grades) {
            media += grade;
        }
        media = media/3;
        return media;
    }
    
}
