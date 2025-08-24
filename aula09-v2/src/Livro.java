public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String t, String a, int to, Pessoa l){
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotPaginas(to);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(l);
    }
    public void detalhes(){
        System.out.println("Título: "+ this.getTitulo());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Página atual: "+ this.getPagAtual());
        System.out.println("Total de páginas: "+ this.getTotPaginas());
        System.out.println("Aberto: "+ this.isAberto());
        System.out.println("Leitor: "+ this.getLeitor().getNome());
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isAberto() {
        return aberto;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        this.setPagAtual(this.getPagAtual()+15);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
}

