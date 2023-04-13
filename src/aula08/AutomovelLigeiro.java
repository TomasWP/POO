package aula08;

public class AutomovelLigeiro extends Veiculo implements KmPercorridosInterface {
    

    private String numero_quadro;
    private int capacidade_bagageira;
    private int trajeto = 0, ultimo_trajeto;

    public AutomovelLigeiro(String matricula, String marca, String modelo,int potencia, String numero_quadro, int capacidade_bagageira){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.capacidade_bagageira = capacidade_bagageira;
    }

    public String getNumero_quadro() {
        return this.numero_quadro;
    }

    public int getCapacidade_bagageira() {
        return this.capacidade_bagageira;
    }

    public void setNumero_quadro(String numero_quadro) {
        this.numero_quadro = numero_quadro;
    }

    public void setCapacidade_bagageira(int capacidade_bagageira) {
        this.capacidade_bagageira = capacidade_bagageira;
    }

    public boolean validate_numero_quadro(String numero_quadro){
        if(numero_quadro.length() == 17){
            return true;
        }
        return false;
    }

    public boolean validate_capacidade_bagageira(int capacidade_bagageira){
        if(capacidade_bagageira > 0){
            return true;
        }
        return false;
    }

    public void trajeto(int quilometros) {
        trajeto += quilometros;
        ultimo_trajeto = quilometros;
    }
 
    public int ultimoTrajeto() {
        return ultimo_trajeto;
    }
 
 
    public int distanciaTotal() {
        return trajeto;
    }

    @Override
    public String toString() {
        return "\nVeiculo Ligeiro{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", VIN=" + getNumero_quadro() +
                ", capacidade bagageira=" + getCapacidade_bagageira() +
                '}';
    }
}
