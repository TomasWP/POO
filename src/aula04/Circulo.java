package aula04;
import Util.UserInput;

public class Circulo {

    double raio;

    Circulo (double raio){
        if (!UserInput.positivo(raio)){
            this.raio = raio;
        }
    } 

    public double getRaio() {
        return this.raio;
    }

    public double getArea(){
        double area = Math.PI*Math.pow(getRaio(),2);
        return area;
    }

    public double getPerimetro(){
        double perimetro = 2*Math.PI*getRaio();
        return perimetro;
    }

    public void setRaio(double raio) {
        if (!UserInput.positivo(raio)){
            this.raio = raio;
        }
    }

    @Override
    public String toString() {
        String output = "Raio - "+getRaio()+"\n Perimetro - "+getPerimetro()+"\n Area - "+getArea();
        return output;
    }

}
