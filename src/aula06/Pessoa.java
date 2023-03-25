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
        if(validName(nome)){
            this.nome = nome;
        }
    }

    public void setCc(int cc) {
        if(validCC(cc)){
            this.cc = cc;
        }
    }

    public void setDataNasc(DateYMD dataNasc) {
        if(DateYMD.valid(dataNasc.getDay(), dataNasc.getMonth(), dataNasc.getYear())){
            this.dataNasc = dataNasc;
        }
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

    public static boolean valid(String nome, int cc, int day, int month, int year){
        if(DateYMD.valid(day, month, year) && validName(nome) && validCC(cc)){
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