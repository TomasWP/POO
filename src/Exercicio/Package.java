package Exercicio;

public class Package {

    private int id;
    private double peso;
    private String destino, remetente;

    public Package(int id, double peso, String destino, String remetente){
        this.id = id;
        this.peso = peso;
        this.destino = destino;
        this.remetente = remetente;
    }

    public int getId(){
        return id;
    }

    public double getPeso(){
        return peso;
    }

    public String getDestino(){
        return destino;
    }

    public String getRemetente(){
        return remetente;
    }

    public void setId(int id){
     
        this.id = id;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setRemetente(String remetente){
        this.remetente = remetente;
    }

    @Override
    public String toString(){
        return "ID: "+id+" Peso: "+peso+" Destino: "+destino+" Remetente: "+remetente;
    }
}
