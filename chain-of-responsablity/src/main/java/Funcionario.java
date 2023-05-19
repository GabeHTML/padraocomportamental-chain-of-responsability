import java.util.ArrayList;
public abstract class Funcionario {
    protected ArrayList<TipoFuncao> atendimentoFuncionario = new ArrayList<>();
    private Funcionario funcionario;

    public Funcionario getFuncionario(){
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public abstract String getTipoAtendimentoFuncao();

    public String executarFuncao(Recepcao recepcao){
        if(atendimentoFuncionario.contains(recepcao.getTipoProfessor())){
            return getTipoAtendimentoFuncao();
        } else{
            if (funcionario != null){
                return funcionario.executarFuncao(recepcao);
            }else {
                return "Esse serviço está indisponivel";
            }
        }
    }

    public abstract String getTipoProfessorFuncao();
}
