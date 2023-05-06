package aula10;
import java.util.*;

public class LivrosEx2 {
        
        private HashMap<String, Set<Livro>> livros;

        Set<Livro> drama = new HashSet<>();
        Set<Livro> romance = new HashSet<>();
        Set<Livro> ficcao = new HashSet<>();
        Set<Livro> biografia = new HashSet<>();
        Set<Livro> historia = new HashSet<>();

        public LivrosEx2(){
            livros = new HashMap<>();
        }

        public void adicionarLivro(String genero, Livro Livro) {
            switch(genero){
                case "Drama":
                    if(livros.containsValue(drama)){
                        drama.add(Livro);
                    }else{
                        drama.add(Livro);
                        livros.put(genero, drama);
                    }
                    break;
                case "Romance":
                    if(livros.containsValue(romance)){
                        romance.add(Livro);
                    }else{
                        romance.add(Livro);
                        livros.put(genero, romance);
                    }
                    break;
                case "Ficção":
                    if(livros.containsValue(ficcao)){
                        ficcao.add(Livro);
                    }else{
                        ficcao.add(Livro);
                        livros.put(genero, ficcao); 
                    }
                    break;
                case "Biografia":
                    if(livros.containsValue(biografia)){
                        biografia.add(Livro);
                    }else{
                        biografia.add(Livro);
                        livros.put(genero, biografia);
                    }
                    break;
                case "História":
                    if(livros.containsValue(historia)){
                        historia.add(Livro);
                    }else{
                        historia.add(Livro);
                        livros.put(genero, historia);
                    }
                    break;
            }
        }
        
        public void alterarLivro(String genero, Livro livroAntigo, Livro livroNovo) {
            switch(genero){
                case "Drama":
                    drama.remove(livroAntigo);
                    drama.add(livroNovo);
                    break;
                case "Romance":
                    romance.remove(livroAntigo);
                    romance.add(livroNovo);
                    break;
                case "Ficção":
                    ficcao.remove(livroAntigo);
                    ficcao.add(livroNovo);
                    break;
                case "Biografia":
                    biografia.remove(livroAntigo);
                    biografia.add(livroNovo);
                    break;
                case "História":
                    historia.remove(livroAntigo);
                    historia.add(livroNovo);
                    break;
            }
        }
        
        public void removerLivro(String genero, Livro livro) {
            switch(genero){
                case "Drama":
                    drama.remove(livro);
                    break;
                case "Romance":
                    romance.remove(livro);
                    break;
                case "Ficção":
                    ficcao.remove(livro);
                    break;
                case "Biografia":
                    biografia.remove(livro);
                    break;
                case "História":
                    historia.remove(livro);
                    break;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
        
            // Lista de Gêneros e Livros
            sb.append("Lista de Gêneros e Livros:\n");
            for (Map.Entry<String, Set<Livro>> entry : livros.entrySet()) {
                String genero = entry.getKey();
                Set<Livro> livros = entry.getValue();
                for (Livro livro : livros) {
                    sb.append("Gênero: ").append(genero).append("\n");
                    switch(genero){
                        case "Drama":
                            for(int i = drama.size(); i>0;i--){
                                if(i == 1){
                                    sb.append(livro.toString()).append("\n\n");
                                }else{
                                    sb.append(livro.toString()).append("\n");
                                }
                            }
                            break;
                        case "Romance":
                            for(int i = romance.size(); i>0;i--){
                                if(i == 1){
                                    sb.append("Livro: ").append(livro.toString()).append("\n\n");
                                }else{
                                    sb.append("Livro: ").append(livro.toString()).append("\n");
                                }
                            }
                            break;
                        case "Ficção":
                            for(int i = ficcao.size(); i>0;i--){
                                if(i == 1){
                                    sb.append("Livro: ").append(livro.toString()).append("\n\n");
                                }else{
                                    sb.append("Livro: ").append(livro.toString()).append("\n");
                                }
                            }
                            break;
                        case "Biografia":
                            for(int i = biografia.size(); i>0;i--){
                                if(i == 1){
                                    sb.append("Livro: ").append(livro.toString()).append("\n\n");
                                }else{
                                    sb.append("Livro: ").append(livro.toString()).append("\n");
                                }
                            }
                            break;
                        case "História":
                            for(int i = historia.size(); i>0;i--){
                                if(i == 1){
                                    sb.append("Livro: ").append(livro.toString()).append("\n\n");
                                }else{
                                    sb.append("Livro: ").append(livro.toString()).append("\n");
                                }
                            }
                            break;
                    }
                }
            }
            
            // Lista de Gêneros
            sb.append("Lista de Gêneros:\n");
            for (String genero : livros.keySet()) {
                sb.append(genero).append("\n");
            }
            
            // Lista de Livros
            sb.append("\nLista de Livros:\n");
            for (Set<Livro> livros : livros.values()) {
                for (Livro livro : livros) {
                    sb.append(livro.toString()).append("\n");
                }
            }
            
            return sb.toString();
        }
}
