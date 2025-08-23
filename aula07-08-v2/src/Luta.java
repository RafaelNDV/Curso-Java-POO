import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(){

    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.desafiante = l1;
            this.desafiado = l2;
        }else{
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO: ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE: ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("A luta deu empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome()+" venceu a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome()+" venceu a luta");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }
}
