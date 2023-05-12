package aula11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Gradebook {

    private Map<String, Student> students;

    public Gradebook() {
        this.students = new HashMap<>();
    }

    public void load(String string) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader(string));
        while(input.hasNextLine()){
            List<Double> grades = new ArrayList<>();
            String data = input.nextLine();
            String[] tokens = data.split("\\|");
            grades.add(Double.parseDouble(tokens[1]));
            grades.add(Double.parseDouble(tokens[2]));
            grades.add(Double.parseDouble(tokens[3]));
            Student student = new Student(tokens[0], grades);
            this.students.put(tokens[0], student);
        }
        input.close();

    }

    public void addStudent(Student newStudent) {
        students.put(newStudent.getName(), newStudent);
    }

    public void removeStudent(String string) {
        students.remove(string);
    }

    public Student getStudent(String string) {
        return students.get(string);
    }

    public double calculateAverageGrade(String string) {
        Student student = students.get(string);
        double media = 0;
        for (Double grade : student.getGrades()) {
            media += grade;
        }
        media = media/3;
        return media;
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student.getName()+" - "+student.getGrades());
        }
    }
}
