package aula08;

public class PesadoMercadorias extends Veiculo implements KmPercorridosInterface{
    
    private int peso, carga_maxima;
    private String numero_quadro;
    private int trajeto = 0, ultimo_trajeto;

    public PesadoMercadorias(String matricula, String marca, String modelo,int potencia,String numero_quadro, int peso, int carga_maxima){
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.carga_maxima = carga_maxima;
    }

    public int getPeso() {
        return this.peso;
    }

    public int getCarga_maxima() {
        return this.carga_maxima;
    }

    public String getNumero_quadro() {
        return this.numero_quadro;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setCarga_maxima(int carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public void setNumero_quadro(String numero_quadro) {
        this.numero_quadro = numero_quadro;
    }

    public boolean validate_peso(int peso){
        if(peso > 0){
            return true;
        }
        return false;
    }

    public boolean validate_carga_maxima(int carga_maxima){
        if(carga_maxima > 0){
            return true;
        }
        return false;
    }

    public boolean validate_numero_quadro(String numero_quadro){
        if(numero_quadro.length() == 17){
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
        return "\nPesado de Mercadorias{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                ", VIN=" + getNumero_quadro() +
                ", peso=" + getPeso() +
                ", carga máxima=" + getCarga_maxima() +
                '}';
    }
}
