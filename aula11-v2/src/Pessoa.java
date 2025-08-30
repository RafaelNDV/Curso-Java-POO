public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public int getIdade() {
        return idade;
    }

    public void  fazerAniversario(){
        this.setIdade(getIdade() + 1);
        System.out.println(this.getNome()+ " agora tem "+ this.getIdade()+" anos de idade.");
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void apresentar(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());
    }
}
