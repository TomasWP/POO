package EP;

public class GarageStorage extends StorageUnit{
    
    private int duracao;
    public GarageStorage(String localizacao, int[] dimensoes, int preco){
        super(localizacao, dimensoes, preco);
        this.duracao = 5*365;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getType(){
        return "Garage";
    }

    @Override
    public String toString(){
        return "Duração = "+duracao;
    }
}
