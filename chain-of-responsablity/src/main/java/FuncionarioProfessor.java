public class FuncionarioProfessor extends Funcionario{
    public FuncionarioProfessor(Funcionario funcionario){
        atendimentoFuncionario.add(Professor.getInstance());
        setFuncionario(funcionario);
    }

    @Override
    public String getTipoAtendimentoFuncao() {
        return null;
    }

    @Override
    public String getTipoProfessorFuncao(){
        return "Aula dada pelo Professor.";
    }
}
