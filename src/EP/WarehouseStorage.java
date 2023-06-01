package EP;

public class WarehouseStorage extends StorageUnit {

    private int duracao;
    
    public WarehouseStorage(String localizacao, int[] dimensoes, int preco){
        super(localizacao, dimensoes, preco);
        this.duracao = 10*365;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getType(){
        return "Warehouse";
    }

    @Override
    public String toString(){
        return "Duração = "+duracao;
    }
}
