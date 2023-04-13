package aula08;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {

    private int cargaAtual;
    private int autonomia;

    public AutomovelLigeiroEletrico(String matricula, String marca, String modelo,int potencia, String numero_quadro, int capacidade_bagageira){
        super(matricula, marca, modelo, potencia, numero_quadro, capacidade_bagageira);
        this.cargaAtual = 0;
        this.autonomia = 100;
    }

    public int autonomia() {
        return autonomia;
    }

    public void carregar(int percentagem) {
        if(percentagem > 0 && percentagem <= 100){
            if(cargaAtual + percentagem > 100){
                cargaAtual = 100;
            }else{
                cargaAtual += percentagem;
            }
        }else{
            System.out.println("Insira uma percentagem válida!");
        }
    }

    @Override
    public String toString() {
        return "\nVeiculo Ligeiro Elétrico{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", VIN=" + getNumero_quadro() +
                ", capacidade bagageira=" + getCapacidade_bagageira() +
                ", autonomia=" + this.autonomia +
                '}';
    }
    
}
