package aula06;
import java.util.regex.Pattern;

import aula05.DateYMD;

public class Contacto extends Pessoa{
    
    static int sequencial = 99;
    private String telemovel;
    private String email;
    private int numero_sequencial;

    public Contacto(String nome, int cc, DateYMD dataNasc, String telemovel, String email){
        
        super(nome, cc, dataNasc);
        if(!valid(telemovel, email)){
            throw new IllegalArgumentException("O contacto não é válido");
        }
        this.email = email;
        this.telemovel = telemovel;
        this.numero_sequencial = sequencial();
    }

    public boolean valid(String telemovel, String email){
        if((email == null && telemovel == null) || !valid_telemovel(email) || !valid_email(email)){
            return false;
        }
        return true;
    }

    public static int sequencial(){
        sequencial++;
        return sequencial;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public String getEmail() {
        return email;
    }

    public int getNumero_sequencial() {
        return numero_sequencial;
    }

    public void setTelemovel(String telemovel) {
        if(!valid_telemovel(telemovel)){
            System.out.println("O número de telemóvel não é válido");
        }else{
            this.telemovel = telemovel;
        }
    }
    
    public void setEmail(String email) {
        if(!valid_email(email)){
            System.out.println("O email não é válido");
        }else{
            this.email = email;
        }
    }

    public static boolean valid_telemovel(String phoneNumber) {
        String regex = "^9\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean valid_email(String email) {
        String regex = "^[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Email: " + getEmail() + ", Telemóvel: " + getTelemovel() + ", ID: " + getNumero_sequencial();
    }
}
