package EP;

public class LockerStorage extends StorageUnit{

    private int duracao;
    public LockerStorage(String localizacao, int[] dimensoes, int preco){
        super(localizacao, dimensoes, preco);
        this.duracao = 30;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getType(){
        return "Locker";
    }

    @Override
    public String toString(){
        return "Duração = "+duracao;
    }
}
