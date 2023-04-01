package aula07;
import Util.UserInput;

public class Circulo extends Forma {

    double raio;
    String cor;

    Circulo (double raio, String cor){
        if (!UserInput.positivo(raio) && !UserInput.is_numeric(cor)){
            this.raio = raio;
            this.cor = cor;
        }
    } 

    public double getRaio() {
        return this.raio;
    }

    public String getCor(){
        return this.cor;
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

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Circulo circulo = (Circulo) obj;
		return this.raio == circulo.raio && this.cor == circulo.cor;
	}

    @Override
    public String toString() {
        String output = "Raio - "+getRaio()+"\n Perimetro - "+getPerimetro()+"\n Area - "+getArea()+"\n Cor - "+getCor();
        return output;
    }

}
