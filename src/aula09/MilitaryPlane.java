package aula09;

public class MilitaryPlane extends Plane {
    private int numMunicao;
    
    public MilitaryPlane(String id, String fabricante, String modelo, int ano, int maxPassageiros, int velocidadeMax, int numMunicao) {
        super(id, fabricante, modelo, ano, maxPassageiros, velocidadeMax);
        this.numMunicao = numMunicao;
    }

    @Override
    public String getPlaneType() {
        return "MilitaryPlane";
    }
    
    public int getNumMunicao() {
        return numMunicao;
    }
    
    public void setNumMissiles(int numMunicao) {
        this.numMunicao = numMunicao;
    }
    
    @Override
    public String toString() {
        return "MilitaryPlane [id=" + getId() + ", fabricante=" + getFabricante() + ", modelo=" + getModelo() + ", ano=" + getYear()
                + ", Máximo Passageiros=" + getmaxPassageiros() + ", Velocidade Máxima=" + getVelocidadeMax() + ", Número Munições=" + getNumMunicao() + "]";
    }
}
