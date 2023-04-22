package aula08;
import java.util.Objects;

public class Cereal implements Alimento {
    private String nome;
    private double proteinas;
    private double calorias;
    private double peso;

    public Cereal(String nome, double proteinas, double calorias, double peso) {
        this.nome = nome;
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPeso() {
        return peso;
    }

    public String toString() {
        return "Cereal{" +
                "nome='" + nome + '\'' +
                ", proteina=" + proteinas +
                ", calorias=" + calorias +
                ", peso=" + peso +
                '}';
    }

    public int hashCode() {
        return Objects.hash(nome, proteinas, calorias, peso);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cereal)) return false;
        Cereal cereal = (Cereal) obj;
        return Double.compare(cereal.proteinas, proteinas) == 0 &&
                Double.compare(cereal.calorias, calorias) == 0 &&
                Double.compare(cereal.peso, peso) == 0 &&
                Objects.equals(nome, cereal.nome);
    }

    public double getProteinas() {
        return proteinas;
    }

    public boolean isVegetariano() {
        return true;
    }

    
}
