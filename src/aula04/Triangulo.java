package aula04;
import Util.UserInput;

public class Triangulo {
    
    double lado_1, lado_2, lado_3;
    
    Triangulo (double lado_1, double lado_2, double lado_3){
        if (!UserInput.positivo(lado_1) && !UserInput.positivo(lado_2) && !UserInput.positivo(lado_3)){
            this.lado_1 = lado_1;
            this.lado_2 = lado_2;
            this.lado_3 = lado_3;
        }
    }

    public double getLado(int lado_numero) {
        if (lado_numero == 1){
            return this.lado_1;
        } else if(lado_numero == 2){
            return this.lado_2;
        } else{
            return this.lado_3;
        }
    }

    public double getArea(){
        double semi_perimetro = getPerimetro()/2;
        double area = Math.sqrt(semi_perimetro*(semi_perimetro-getLado(1))*(semi_perimetro-getLado(2))*(semi_perimetro-getLado(3)));
        return area;
    }

    public double getPerimetro(){
        double perimetro = getLado(1)+getLado(2)+getLado(3);
        return perimetro;
    }

    public void setLado(int lado_numero, double valor) {
        if (!UserInput.positivo(valor)){
            if (lado_numero == 1){
                this.lado_1 = valor;
            } else if(lado_numero == 2){
                this.lado_2 = valor;
            } else{
                this.lado_3 = valor;
            }
        }
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Triangulo triangulo = (Triangulo) obj;
		return this.lado_1 == triangulo.lado_1 && this.lado_2 == triangulo.lado_2 && this.lado_3 == triangulo.lado_3;
	}

    @Override
    public String toString() {
        String output = "Lado 1 - "+getLado(1)+"\n Lado 2 - "+getLado(2)+"\n Lado 3 - "+getLado(3)+"Perimetro - "+getPerimetro()+"\n Area - "+getArea();
        return output;
    }

}
