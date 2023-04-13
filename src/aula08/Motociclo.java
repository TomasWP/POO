package aula08;

public class Motociclo extends Veiculo implements KmPercorridosInterface{

    private String tipo;
    private int trajeto = 0, ultimo_trajeto;

    public Motociclo(String matricula, String marca, String modelo,int potencia, String tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }


    public boolean validate_tipo(String tipo){
        if(tipo.equals("desportiva") || tipo.equals("estrada")){
            return true;
        }
        return false;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "\nMotociclo{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", tipo=" + getTipo() +
                '}';
    }
}
