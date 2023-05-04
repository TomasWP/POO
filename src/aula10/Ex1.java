package aula10;

public class Ex1 {
    public static void main(String[] args) {

        Livros livros = new Livros();

        Livro livro_drama = new Livro("O Apanhador no Campo de Centeio", "J.D. Salinger", 1951);
        Livro livro_romance = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        Livro livro_ficcao = new Livro("1984", "George Orwell", 1949);
        Livro livro_biografia = new Livro("Steve Jobs", "Walter Isaacson", 2011);
        Livro livro_historia = new Livro("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 2011);
        Livro livro_historia_2 = new Livro("The Handmaid's Tale", "Margaret Atwood", 1985);

        livros.adicionarLivro("Drama", livro_drama);
        livros.adicionarLivro("Romance", livro_romance);
        livros.adicionarLivro("Ficção", livro_ficcao);
        livros.adicionarLivro("Biografia", livro_biografia);
        livros.adicionarLivro("História", livro_historia);

        System.out.println(livros);

        livros.alterarLivro("Romance", livro_historia_2);
        livros.removerLivro("Biografia");

        System.out.println(livros);
    }
}
