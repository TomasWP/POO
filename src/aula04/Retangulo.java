package aula04;
import Util.UserInput;

public class Retangulo {
    double comprimento, altura;
    
    Retangulo(double comprimento, double altura){
        if (!UserInput.positivo(comprimento) && !UserInput.positivo(altura)){
            this.comprimento = comprimento;
            this.altura = altura;
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double getArea(){
        double area = getComprimento()*getAltura();
        return area;
    }
    
    public double getPerimetro(){
        double perimetro = (getComprimento()+getAltura())*2;
        return perimetro;
    }

    public void setAltura(double altura) {
        if (!UserInput.positivo(altura)){
            this.altura = altura;
        }
    }

    public void setComprimento(double comprimento) {
        if (!UserInput.positivo(comprimento) ){
            this.comprimento = comprimento;
        }
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Retangulo retangulo = (Retangulo) obj;
		return this.comprimento == retangulo.comprimento && this.altura == retangulo.altura;
	}

    @Override
    public String toString() {
        String output = "Comprimento - "+getAltura()+"\n Altura - "+getComprimento()+"\n Perimetro - "+getPerimetro()+"\n Area - "+getArea();
        return output;
    }
}
