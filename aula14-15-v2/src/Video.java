public class Video implements AcoesVideo {
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1.0f;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public void status(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Avaliação: "+this.avaliacao);
        System.out.println("Views: "+this.views);
        System.out.println("Curtidas: "+this.curtidas);
        System.out.println("Reproduzinod: "this.reproduzindo);
    }

    @Override
    public void play() {
        this.reproduzindo = true;
        System.out.println("Play no vídeo");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println("Video pausado");
    }

    @Override
    public void like() {
        this.curtidas ++;
        System.out.println("Agora o video tem "+this.curtidas+" curtidas.");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
}
