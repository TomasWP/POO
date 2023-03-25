package aula06;
import aula05.DateYMD;

public class Professor extends Pessoa {

    private String categoria, departamento;
    
    public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento){
        super(nome, cc, dataNasc);
        if(!valid(nome, cc, dataNasc.getDay(), dataNasc.getMonth(), dataNasc.getYear())){
            throw new IllegalArgumentException("O contacto não é válido");
        }
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void set_categoria(String categoria){
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", CC: " + this.cc + ", Data de Nascimento: " + this.dataNasc + ", Categoria: " + getCategoria() + ", Departamento: " + getDepartamento();
    }
}
