package EP;

public class StorageUnit {
    
    private String localizacao;
    private int[] dimensoes;
    private int preco;

    public StorageUnit(String localizacao, int[] dimensoes, int preco){
        this.localizacao = localizacao;
        this.dimensoes = dimensoes;
        this.preco = preco;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public void setDimensoes(int[] dimensoes){
        this.dimensoes = dimensoes;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public int[] getDimensoes(){
        return dimensoes;
    }

    public int getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return "Localizacao = "+this.localizacao+"\nDimensoes = "+this.dimensoes+"\nPreço = "+this.preco;
    }
}
