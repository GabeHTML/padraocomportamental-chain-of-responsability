public class Mestrado implements TipoProfessor{
    private static Mestrado mestrado = new Mestrado();
    private Mestrado(){}
    public static TipoFuncao getInstance(){
        return mestrado;
    }

    @Override
    public String tipoProfessorExecutado(){
        return "Mestrado";
    }
}
