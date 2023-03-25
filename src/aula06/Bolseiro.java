package aula06;
import Util.UserInput;
import aula05.DateYMD;

public class Bolseiro extends Aluno{
    
    private String orientador;
    private int bolsa;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int bolsa){
        super(nome, cc, dataNasc, null);
        if(UserInput.positivo(bolsa)|| !valid(nome, cc, dataNasc.getDay(), dataNasc.getMonth(), dataNasc.getYear())){
            throw new IllegalArgumentException("O contacto não é válido");
        }
        this.orientador = orientador.getNome();
        this.bolsa = bolsa;
    }

    public String getOrientador() {
        return orientador;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", CC: " + this.cc + ", Data de Nascimento: " + this.dataNasc + ", Orientador: " + getOrientador() + ", Montante da Bolsa: " + getBolsa();
    }
}
