public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float valor){
        this.setSalario(this.getSalario() + valor);
        System.out.println("O novo salário do professor "+ this.getNome()+" agora é "+ this.getSalario());
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}
