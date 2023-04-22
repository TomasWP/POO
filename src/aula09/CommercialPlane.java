package aula09;

public class CommercialPlane extends Plane{

    private int numTripulantes;

    public CommercialPlane(String id, String fabricante, String modelo, int ano, int maxPassageiros, int velocidadeMax, int numTripulantes) {
        super(id, fabricante, modelo, ano, maxPassageiros, velocidadeMax);
        this.numTripulantes = numTripulantes;
    }

    @Override
    public String getPlaneType() {
        return "Commercial";
    }

    public int getnumTripulantes() {
        return numTripulantes;
    }
    
    public void setnumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }
    
    @Override
    public String toString() {
        return "CommercialPlane [id=" + getId() + ", fabricante=" + getFabricante() + ", modelo=" + getModelo() + ", ano=" + getYear()
                + ", Máximo Passageiros=" + getmaxPassageiros() + ", Velocidade Máxima=" + getVelocidadeMax() + ", Número Tripulantes=" + getnumTripulantes() + "]";
    }
}
