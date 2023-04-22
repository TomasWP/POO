package aula08;

public class ProdutoComDesconto implements Produto {

    private String produto;
    private double desconto;
    private double preco;
    private int quantidade;

    public ProdutoComDesconto(String produto,double preco, int quantidade, double desconto) {
        this.produto = produto;
        this.desconto = desconto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return produto;
    }

    public double getPreco() {
        return preco - (preco*(desconto/100));
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
}
