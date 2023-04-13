package aula08;

public class Veiculo {
    
    protected String matricula, marca, modelo;
    protected int potencia;

    public Veiculo(String matricula, String marca, String modelo,int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean validate_matricula(String matricula){
        if(matricula.length() == 8 && matricula.contains("-")){
            return true;
        }
        return false;
    }

    public boolean validate_marca(String marca){
        if(marca.length() > 0){
            return true;
        }
        return false;
    }

    public boolean validate_modelo(String modelo){
        if(modelo.length() > 0){
            return true;
        }
        return false;
    }

    public boolean validate_potencia(int potencia){
        if(potencia > 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nVeiculo{" +
                "matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia=" + getPotencia() +
                '}';
    }
}
