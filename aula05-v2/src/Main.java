public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta();
        c1.depositar(500);
        c1.pagarMensal();
        c1.sacar(400);
        c1.fecharConta();
    }
}