package aula10;

public class Livro {

    private String title, author;
    private int year;

    public Livro (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return title + " - " + author + " - " + year;
    }
}
