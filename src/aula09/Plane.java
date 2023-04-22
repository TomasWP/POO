package aula09;

public class Plane {
    private String id, fabricante, modelo;
    private int ano, maxPassageiros, velocidadeMax;

    public Plane(String id, String fabricante, String modelo, int ano, int maxPassageiros, int velocidadeMax) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.maxPassageiros = maxPassageiros;
        this.velocidadeMax = velocidadeMax;
    }
    
        
    public String getPlaneType() {
        return "Plane";
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getYear() {
        return ano;
    }
    
    public void setYear(int ano) {
        this.ano = ano;
    }
    
    public int getmaxPassageiros() {
        return maxPassageiros;
    }
    
    public void setmaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }
    
    public int getVelocidadeMax() {
        return velocidadeMax;
    }
    
    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    
    public String toString() {
        return "Plane [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ano=" + ano + ", Máximo Passageiros=" + maxPassageiros + ", Velocidade Máxima=" + velocidadeMax + "]";
    }
}
