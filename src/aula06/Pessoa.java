package aula06;
import aula05.DateYMD;

import Util.UserInput;

public class Pessoa {

    protected String nome;
    protected int cc;
    protected DateYMD dataNasc;
    
    public Pessoa (String nome, int cc, DateYMD dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public int getCC() {
        return cc;
    }

    public DateYMD getDataNasc() {
        return dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }

    public static boolean validName(String nome){
        if(UserInput.is_numeric(nome)){
            return false;
        }
        return true;
    }

    public static boolean validCC(int cc){
        if(UserInput.is_numeric(Integer.toString(cc))){
            if(Integer.toString(cc).length() > 0){
                return true;
            }
        }
        return false;
    }

    public static boolean valid(String nome, int cc){
        if(validName(nome) && validCC(cc)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String output = getNome()+"; CC: "+Integer.toString(getCC())+"; Data de Nascimento: "+getDataNasc();
        return output;
    }
}