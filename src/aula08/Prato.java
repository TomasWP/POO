package aula08;

import java.util.ArrayList;
import java.util.List;

public class Prato implements Comparable<Prato> {

    private String nome;
    private List<Alimento> composicao;

    public Prato(String nome) {
        this.nome = nome;
        this.composicao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionarAlimento(Alimento alimento) {
        composicao.add(alimento);
        return true;
    }

    public List<Alimento> getComposicao() {
        return composicao;
    }

    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Alimento alimento : composicao) {
            pesoTotal += alimento.getPeso();
        }
        return pesoTotal;
    }

    public double getCalorias() {
        double calorias = 0;
        for (Alimento alimento : composicao) {
            calorias += alimento.getCalorias();
        }
        return calorias;
    }

    public double getProteinas() {
        double proteinas = 0;
        for (Alimento alimento : composicao) {
            proteinas += alimento.getProteinas();
        }
        return proteinas;
    }

    public int compareTo(Prato outro) {
        return Double.compare(this.getCalorias(), outro.getCalorias());
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prato other = (Prato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public String toString() {
        return "Prato [nome=" + nome + ", composicao=" + composicao + "]";
    }
}
