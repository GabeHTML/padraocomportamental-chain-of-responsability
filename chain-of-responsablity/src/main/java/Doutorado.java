public class Doutorado implements TipoProfessor{
    private static Doutorado doutorado = new Doutorado();
    private Doutorado(){}
    public static TipoFuncao getInstance(){
        return doutorado;
    }

    @Override
    public String tipoProfessorExecutado(){
        return "Doutorado";
    }
}
