public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade.");
    }
    @Override
    public void apresentar(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo());
        System.out.println("matricula: "+ this.getMatricula());
        System.out.println("curso: "+ this.getCurso());
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
