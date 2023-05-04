package aula10;
import java.util.*;

public class LivrosEx2 {
        
        private HashMap<String, Set<Livro>> livros;

        public LivrosEx2(){
            livros = new HashMap<>();
        }

        public void adicionarLivro(String genero, Livro Livro) {
            livros.put(genero, );
        }
        
        public void alterarLivro(String genero, Livro livroAntigo, Livro livroNovo) {

        }
        
        public void removerLivro(String genero, Livro livro) {

        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\nLista de Gêneros:\n");
            for (String genero : livros.keySet()) {
                sb.append(genero + "\n");
            }
            sb.append("\nLista de Gêneros e Livros:\n");
            sb.append("Titulo-Autor-Ano\n");
            for (String genero : livros.keySet()) {
                sb.append("\nGênero: " + genero + "\n");
                sb.append(livros.get(genero).toString() + "\n");
            }
            sb.append("\nLista de Livros(Titulo-Autor-Ano):\n");
            for (Livro livro : livros.values()) {
                sb.append(livro.toString() + "\n");
            }
            return sb.toString();
        }
}
