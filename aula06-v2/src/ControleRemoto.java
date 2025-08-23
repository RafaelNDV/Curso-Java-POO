public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: "+ this.isLigado());
        System.out.println("Tocando: "+ this.isTocando());
        System.out.print("Volume: "+ this.getVolume());
        for(int i = 0; i<= this.getVolume(); i+=10){
            System.out.print("[]");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o meu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            this.setVolume(this.getVolume()+5);
            System.out.print("Volume: "+this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+=10){
                System.out.print("[]");
            }
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()){
            this.setVolume(this.getVolume()-5);
            System.out.print("Volume: "+this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+=10) {
                System.out.print("[]");
            }
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
            System.out.print("Volume: "+getVolume());
            for(int i = 0; i <= this.getVolume(); i+=10) {
                System.out.print("[]");
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.print("Volume: "+getVolume());
            for(int i = 0; i <= this.getVolume(); i+=10) {
                System.out.print("[]");
            }
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
            System.out.println("Tocando: "+this.isTocando());
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("Tocando: "+this.isTocando());
        }
    }
}
