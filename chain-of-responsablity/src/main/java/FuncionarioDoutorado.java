public class FuncionarioDoutorado extends Funcionario{
    public FuncionarioDoutorado(Funcionario funcionario){
        atendimentoFuncionario.add(Doutorado.getInstance());
        setFuncionario(funcionario);
    }

    @Override
    public String getTipoAtendimentoFuncao() {
        return null;
    }

    @Override
    public String getTipoProfessorFuncao(){
        return "Aula dada pelo Professor de Doutorado.";
    }
}
