package EP;

public class LockerStorage extends StorageUnit{

    private int duracao;
    public LockerStorage(String localizacao, int[] dimensoes, int preco){
        super(localizacao, dimensoes, preco);
        this.duracao = 5*365;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    @Override
    public String toString(){
        return "Duração = "+duracao;
    }
}
