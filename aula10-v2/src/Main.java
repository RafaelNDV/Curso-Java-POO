public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 22, "M");
        Aluno p2 = new Aluno("Leticia", 20,"F",234, "TI");
        Professor p3 = new Professor("Rogerio", 45, "M");
        Funcionario p4 = new Funcionario("Leandro", 28, "M");

        p1.fazerAniv();
        p3.fazerAniv();
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

    }
}