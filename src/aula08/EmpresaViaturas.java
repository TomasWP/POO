package aula08;
import java.util.ArrayList;

public class EmpresaViaturas {
    
    private String nome, codigo_postal, email;
    private ArrayList<Veiculo> conjunto_veiculos;

    public EmpresaViaturas(String nome, String codigo_postal, String email){
        this.nome = nome;
        this.codigo_postal = codigo_postal;
        this.email = email;
        this.conjunto_veiculos = new ArrayList<>();
    }

    public int getNumeroViaturas(){
        return conjunto_veiculos.size();
    }
    public String getNome() {
        return this.nome;
    }

    public String getCodigo_postal() {
        return this.codigo_postal;
    }

    public String getEmail() {
        return this.email;
    }

    public ArrayList<Veiculo> getConjunto_veiculos() {
        return this.conjunto_veiculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validate_nome(String nome){
        if(nome.length() > 0){
            return true;
        }
        return false;
    }

    public boolean validate_codigo_postal(String codigo_postal){
        if(codigo_postal.length() == 8 && codigo_postal.contains("-")){
            return true;
        }
        return false;
    }

    public boolean validate_email(String email){
        if(email.contains("@")){
            return true;
        }
        return false;
    }

    public void addVeiculo(Veiculo veiculo){
        conjunto_veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo){
        conjunto_veiculos.remove(veiculo);
    }

    public void listVeiculos(){
        for(Veiculo veiculo : conjunto_veiculos){
            System.out.println(veiculo);
        }
    }

    public int getTotalQuilometrosPercorridos() {
        int total = 0;
        for (Veiculo v : this.conjunto_veiculos) {
            if (v instanceof KmPercorridosInterface) {
                total += ((KmPercorridosInterface) v).distanciaTotal();
            }
        }
        return total;
    }

    public Veiculo getViaturaMaiorQuilometragem() {
        Veiculo viaturaMaiorQuilometragem = null;
        int maiorQuilometragem = 0;
        for (Veiculo v : conjunto_veiculos) {
            if (v instanceof KmPercorridosInterface) {
                int quilometragem = ((KmPercorridosInterface) v).distanciaTotal();
                if (quilometragem > maiorQuilometragem) {
                    maiorQuilometragem = quilometragem;
                    viaturaMaiorQuilometragem = v;
                }
            }
        }
        return viaturaMaiorQuilometragem;
    }

    @Override
    public String toString() {
        return "\nEmpresa{" +
                "nome='" + nome + '\'' +
                ", codigoPostal='" + codigo_postal + '\'' +
                ", email='" + email + '\'' +
                ", viaturas=" + conjunto_veiculos +
                '}';
    }
}
