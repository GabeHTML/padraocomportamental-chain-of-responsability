public class FuncionarioMestrado extends Funcionario{
    public FuncionarioMestrado(Funcionario funcionario){
        atendimentoFuncionario.add(Mestrado.getInstance());
        setFuncionario(funcionario);
    }

    @Override
    public String getTipoAtendimentoFuncao() {
        return null;
    }

    @Override
    public String getTipoProfessorFuncao(){
        return "Aula dada pelo Professor de Mestrado.";
    }
}
