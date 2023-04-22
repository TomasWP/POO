package aula08;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoCompras implements Compra {
    private static Map<Produto, Integer> produtos = new HashMap<>();

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            produtos.put(produto, produtos.get(produto) + quantidade);
        } else {
            produtos.put(produto, quantidade);
        }
    }

    @Override
    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            System.out.printf("%s - Preço: %.2f€ - Quantidade: %d\n", produto.getNome(), produto.getPreco(), quantidade);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            total += produto.getPreco() * quantidade;
        }
        return total;
    }
}
