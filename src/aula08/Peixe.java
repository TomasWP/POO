package aula08;

public class Peixe implements Alimento{

    private String tipo;
    private double proteinas;
    private double calorias;
    private double peso;
    
    public Peixe(TipoPeixe congelado, double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }
    
    public boolean isVegetariano() {
        return false;
    }
    
    public String getNome() {
        return "Peixe " + tipo;
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

    public String toString() {
        return "Peixe{" +
                "tipo='" + tipo + '\'' +
                ", proteinas=" + proteinas +
                ", calorias=" + calorias +
                ", peso=" + peso +
                '}';
    }
}
