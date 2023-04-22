package aula08;

public class PratoVegetariano extends Prato {

    public PratoVegetariano(String nome) {
        super(nome);
        if (!isVegetariano()) {
            throw new IllegalArgumentException("O prato não é vegetariano.");
        }
    }

    private boolean isVegetariano() {
        for (Alimento alimento : super.getComposicao()) {
            if (!alimento.isVegetariano()) {
                return false;
            }
        }
        return true;
    }

    public boolean adicionarAlimento(Alimento alimento) {
        if (alimento instanceof Cereal || alimento instanceof Legume) {
            super.adicionarAlimento(alimento);
        } else {
            throw new IllegalArgumentException("O alimento não é vegetariano.");
        }
        return true;
    }

    public String toString() {
        return "Prato vegetariano: " + super.toString();
    }
}
