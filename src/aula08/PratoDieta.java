package aula08;

public class PratoDieta extends Prato {

    private double limiteCalorias;

    public PratoDieta(String nome, double limiteCalorias) {
        super(nome);
        this.limiteCalorias = limiteCalorias;
    }

    public double getLimiteCalorias() {
        return limiteCalorias;
    }

    public void setLimiteCalorias(double limiteCalorias) {
        this.limiteCalorias = limiteCalorias;
    }

    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Alimento alimento : getComposicao()) {
            pesoTotal += alimento.getPeso();
        }
        return pesoTotal;
    }

    public double getCaloriasTotais() {
        double caloriasTotais = 0;
        for (Alimento alimento : getComposicao()) {
            caloriasTotais += alimento.getCalorias();
        }
        return caloriasTotais;
    }

    public double getProteinasTotais() {
        double proteinasTotais = 0;
        for (Alimento alimento : getComposicao()) {
            proteinasTotais += alimento.getProteinas();
        }
        return proteinasTotais;
    }

    public String toString() {
        return "PratoDieta{" +
                "nome='" + getNome() + '\'' +
                ", composicao=" + getComposicao() +
                ", limiteCalorias=" + limiteCalorias +
                '}';
    }
}
