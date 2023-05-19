public class Professor implements TipoProfessor{
    private static Professor professor = new Professor();
    private Professor(){}
    public static TipoFuncao getInstance(){
        return professor;
    }

    @Override
    public String tipoProfessorExecutado(){
        return "Professor";
    }
}
