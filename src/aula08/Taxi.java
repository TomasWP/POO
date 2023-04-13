package aula08;

public class Taxi extends AutomovelLigeiro{
    
    private int numero_licenca;

    public Taxi(String matricula, String marca, String modelo,int potencia, String numero_quadro, int capacidade_bagageira, int numero_licenca){
        super(matricula, marca, modelo, potencia, numero_quadro, capacidade_bagageira);
        this.numero_licenca = numero_licenca;
    }

    public int getNumero_licenca() {
        return this.numero_licenca;
    }

    public void setNumero_licenca(int numero_licenca) {
        this.numero_licenca = numero_licenca;
    }

    public boolean validate_numero_licenca(int numero_licenca){
        if(numero_licenca > 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nTaxi{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", VIN=" + getNumero_quadro() +
                ", capacidade bagageira=" + getCapacidade_bagageira() +
                ",  número da licença=" + getNumero_licenca() +
                '}';
    }
}
