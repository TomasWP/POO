package Teste;

public class DVD extends LibraryItem{
    
    private int duracao;

    public DVD(int id, String title, boolean disponiblidade, String utilizador, int duracao){
        super(id,title,disponiblidade,utilizador);
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", available=" + getDisponiblidade() +
                ", user='" + getUtilizador() + '\'' +
                ", duration=" + this.duracao +
                '}';
    }
}
