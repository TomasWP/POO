package aula08;

public class Carne implements Alimento{

    private String variedade;
    private double proteinas;
    private double calorias;
    private double peso;

    public Carne(VariedadeCarne frango, double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public boolean isVegetariano() {
        return false;
    }
    
    public String getNome() {
        return "Carne de " + variedade;
    }
    
    public double getProteinas() {
        return proteinas;
    }
    
    public double getCalorias() {
        return calorias;
    }
    
    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Carne{" +
                "variedade='" + variedade + '\'' +
                ", proteinas=" + proteinas +
                ", calorias=" + calorias +
                ", peso=" + peso +
                '}';
    }
}
