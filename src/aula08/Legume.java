package aula08;

public class Legume implements Alimento {
    
    private String nome;
    private double proteinas;
    private double calorias;
    private double peso;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        this.nome = nome;
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
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

    public boolean isVegetariano() {
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(calorias);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(proteinas);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Legume other = (Legume) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        if (Double.doubleToLongBits(proteinas) != Double.doubleToLongBits(other.proteinas))
            return false;
        return true;
    }

    public String toString() {
        return "Legume [nome=" + nome + ", proteinas=" + proteinas + ", calorias=" + calorias + ", peso=" + peso + "]";
    }
}
