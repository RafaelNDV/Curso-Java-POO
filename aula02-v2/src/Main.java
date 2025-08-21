public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.tampada = false;
        c1.ponta = 1.5f;
        c1.status();
        c1.rabiscar();
    }
}