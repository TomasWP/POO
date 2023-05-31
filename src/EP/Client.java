package EP;

public class Client {
    
    private int nif;
    private String nome;
    private ClientType tipo;

    public Client(int nif, String nome, ClientType tipo){
        this.nif = nif;
        this.nome = nome;
        this.tipo = tipo;
    }

    public void setNif(int nif){
        this.nif = nif;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(ClientType tipo){
        this.tipo = tipo;
    }

    public int getNif(){
        return this.nif;
    }

    public String getNome(){
        return this.nome;
    }

    public ClientType getTipo(){
        return this.tipo;
    }

    public String toString(){
        return "Nome = "+this.nome+"\nNIF = "+this.nif+"\nTipo = "+this.tipo;
    }
}
