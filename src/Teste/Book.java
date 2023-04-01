package Teste;

public class Book extends LibraryItem {
    

    private String autor;

    public Book(int id, String title, boolean disponiblidade, String utilizador, String autor){
        super(id,title,disponiblidade,utilizador);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", available=" + getDisponiblidade() +
                ", user='" + getUtilizador() + '\'' +
                ", author='" + this.autor + '\'' +
                '}';
    }
}
