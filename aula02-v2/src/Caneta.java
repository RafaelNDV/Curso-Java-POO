public class Caneta {
    String modelo;
    String cor;
    float ponta;
    boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }
}
