public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void mudaTrabalho(){
        this.setTrabalhando(false);
    }
    public String getSetor() {
        return setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
}
