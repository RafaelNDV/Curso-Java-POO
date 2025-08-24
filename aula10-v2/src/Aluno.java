public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.setMatr(matr);
        this.setCurso(curso);
    }

    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public int getMatr() {
        return matr;
    }
}
