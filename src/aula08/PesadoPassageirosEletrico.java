package aula08;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico{

    private int cargaAtual;
    private int autonomia;

    public PesadoPassageirosEletrico(String matricula, String marca, String modelo,int potencia,String numero_quadro, int peso, int max_passageiros){
        super(matricula, marca, modelo, potencia, numero_quadro, peso, max_passageiros);
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
        return "\nPesado de Passageiros Elétrico{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", VIN=" + getNumero_quadro() +
                ", peso=" + getPeso() +
                ", número máximo de passageiros=" + getMax_passageiros() +
                ", autonomia=" + this.autonomia +
                '}';
    }
}
