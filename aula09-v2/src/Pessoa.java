public class Pessoa {
    private String nome;
    private int idaede;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdaede(idade);
        this.setSexo(sexo);
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

    public int getIdaede() {
        return idaede;
    }

    public void setIdaede(int idaede) {
        this.idaede = idaede;
    }

    public void fazerAniversario(){
        this.setIdaede(this.getIdaede()+1);
        System.out.println("Parabéns "+this.getNome()+" fez aniversário, agora tem "+ this.getIdaede());
    }
}
