public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vit, int der, int em){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(em);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        if(this.getPeso() <= 52.2){
            this.setCategoria("invalido");
        } else if (this.getPeso() <= 70.3){
            this.setCategoria("leve");
        } else if (this.getPeso() <= 83.9) {
            this.setCategoria("medio");
        }else if (this.getPeso() <= 120.2){
            this.setCategoria("pesado");
        }else{
            this.setCategoria("invalido");
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public float getAltura() {
        return altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setCategoria(String categoria) {
       this.categoria = categoria;
    }

    public void apresentar(){
        System.out.println("O lutador "+this.getNome()+" pesando "+this.getPeso()+"kgs com "+this.getAltura()+"cm de altura." );
    }
    public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
        System.out.println("parabéns o lutador "+this.getNome()+" ganhou a luta, agora com total de "+this.getVitorias()+" vitórias");
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        System.out.println("Vish o lutador "+this.getNome()+" perdeu a luta, agora com o total de "+this.getDerrotas()+" derrotas");
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
        System.out.println("O lutador "+this.getNome()+" empatou a luta, agota com um total de "+this.getEmpates()+" empates.");
    }
}