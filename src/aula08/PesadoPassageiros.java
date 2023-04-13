package aula08;

public class PesadoPassageiros extends Veiculo implements KmPercorridosInterface {
    
    private String numero_quadro;
    private int peso, max_passageiros;
    private int trajeto = 0, ultimo_trajeto;

    public PesadoPassageiros(String matricula, String marca, String modelo,int potencia,String numero_quadro, int peso, int max_passageiros){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.max_passageiros = max_passageiros;
    }

    public String getNumero_quadro() {
        return this.numero_quadro;
    }

    public int getPeso() {
        return this.peso;
    }

    public int getMax_passageiros() {
        return this.max_passageiros;
    }

    public void setNumero_quadro(String numero_quadro) {
        this.numero_quadro = numero_quadro;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setMax_passageiros(int max_passageiros) {
        this.max_passageiros = max_passageiros;
    }

    public boolean validate_numero_quadro(String numero_quadro){
        if(numero_quadro.length() == 17){
            return true;
        }
        return false;
    }

    public boolean validate_peso(int peso){
        if(peso > 0){
            return true;
        }
        return false;
    }

    public boolean validate_max_passageiros(int max_passageiros){
        if(max_passageiros > 0){
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
        return "\nPesado de Passageiros{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", VIN=" + getNumero_quadro() +
                ", peso=" + getPeso() +
                ", número máximo de passageiros=" + getMax_passageiros() +
                '}';
    }

}
