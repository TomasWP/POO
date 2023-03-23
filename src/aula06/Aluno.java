package aula06;
import java.util.Calendar;
import aula05.DateYMD;

public class Aluno extends Pessoa{
    
    private DateYMD data_inscricao;
    static int sequencial = 99;
    private int N_Mec;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD data_inscricao){
        super(nome, cc, dataNasc);
        this.N_Mec = sequencial();
        this.data_inscricao = data_inscricao;
    }

    public static int sequencial(){
        sequencial++;
        return sequencial;
    }

    public int getN_Mec() {
        return N_Mec;
    }
    
    public DateYMD getData_inscricao() {
        return data_inscricao;
    }

    public void setData_inscricao(DateYMD data_inscricao) {
        if (data_inscricao == null){
            Calendar dataAtual = Calendar.getInstance();
            Integer ano = dataAtual.get(Calendar.YEAR);
            Integer mes = dataAtual.get(Calendar.MONTH);
            Integer dia_do_Mes = dataAtual.get(Calendar.DAY_OF_MONTH);
            data_inscricao = new DateYMD(ano, mes, dia_do_Mes);
            this.data_inscricao = data_inscricao;
        }
        this.data_inscricao = data_inscricao;
    }

    @Override
    public String toString() {
        String output = "Nome: "+getNome()+"; CC: "+Integer.toString(getCC())+"; Data de Nascimento: "+getDataNasc()+"; Nº Mecanográfico: "+Integer.toString(getN_Mec())+"; Data de Inscrição: "+getData_inscricao();
        return output;
    }
}
