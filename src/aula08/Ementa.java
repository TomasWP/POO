package aula08;
import java.util.ArrayList;

public class Ementa {
    private String nome;
    private String local;
    private ArrayList<Prato> pratos;

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.pratos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public void addPrato(Prato prato) {
        pratos.add(prato);
    }

    public void removerPrato(Prato prato) {
        pratos.remove(prato);
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public double getCaloriasTotal() {
        double totalCalorias = 0;
        for (Prato prato : pratos) {
            totalCalorias += prato.getCalorias();
        }
        return totalCalorias;
    }

    public double getProteinasTotal() {
        double totalProteinas = 0;
        for (Prato prato : pratos) {
            totalProteinas += prato.getProteinas();
        }
        return totalProteinas;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ementa: ").append(nome).append("\n");
        sb.append("Local: ").append(local).append("\n");
        sb.append("Pratos: ").append("\n");
        for (Prato prato : pratos) {
            sb.append(prato.toString()).append("\n");
        }
        sb.append("Total de calorias: ").append(getCaloriasTotal()).append("\n");
        sb.append("Total de proteínas: ").append(getProteinasTotal()).append("\n");
        return sb.toString();
    }
}
