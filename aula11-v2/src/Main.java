public class Main {
    public static void main(String[] args) {
        Visitante visita = new Visitante();
        visita.setNome("Leandro");
        visita.setIdade(16);
        visita.setSexo("M");
        Aluno alu = new Aluno();
        alu.setCurso("TI");
        alu.setMatricula(2345);
        alu.setNome("Vasco");
        alu.setIdade(21);
        alu.setSexo("M");
        alu.apresentar();
        System.out.println("--------------------------------------");
        visita.apresentar();
    }
}