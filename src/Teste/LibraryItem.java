package Teste;

public class LibraryItem {
    
    private int id;
    private String title, utilizador;
    private boolean disponiblidade;

    public LibraryItem(int id, String title, boolean disponiblidade, String utilizador){
        this.id = id;
        this.title = title;
        this.disponiblidade = disponiblidade;
        this.utilizador = utilizador;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean getDisponiblidade(){
        return disponiblidade;
    }

    public String getUtilizador(){
        return utilizador;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDisponiblidade(boolean disponiblidade){
        this.disponiblidade = disponiblidade;
    }

    public void setUtilizador(String utilizador){
        this.utilizador = utilizador;
    }

    public boolean checkout(String utilizador) {
        if (this.disponiblidade) {
            setDisponiblidade(false);
            setUtilizador(utilizador);
            return true;
        }
        return false;
    }

    public void returnItem() {
        setDisponiblidade(true);
        setUtilizador(null);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Available: " + this.disponiblidade + ", Borrower: " + this.utilizador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LibraryItem) {
            LibraryItem other = (LibraryItem) obj;
            return id == other.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

}
