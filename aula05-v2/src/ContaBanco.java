import java.util.Scanner;
public class ContaBanco {
    Scanner sc = new Scanner(System.in);
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus() {
        return status;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void abrirConta(){
        System.out.println("Qual tipo de conta você quer abrir, conta corrente(cc) ou poupança(cp)?");
        String conta = sc.nextLine();
        this.setTipo(conta);
        System.out.println("Qual o seu nome? ");
        String nome = sc.nextLine();
        this.setDono(nome);
        setNumConta(2);
        if (conta.equals("cc")){
            System.out.println("Conta corrente aberta para "+this.getDono()+", com saldo de 50 reais. Número da conta: "+this.getNumConta());
            setStatus(true);
            setSaldo(50);
        } else if (conta.equals("cp")) {
            System.out.println("Conta poupança aberta para "+this.getDono()+" com saldo de 150 reais. Número da conta: "+this.getNumConta());
            setStatus(true);
            setSaldo(150);
        }else{
            System.out.println("Vai aprender a escrever animal");
        }
    }

    public void fecharConta(){
        if(this.getStatus() && this.getSaldo() == 0){
            System.out.println("Conta fechada com sucesso, parabéns");
            this.setStatus(false);
        } else if(!this.getStatus()) {
            System.out.println("Você nem tem conta aberta para poder fechar");
        }else{
            System.out.println("Você tem saldo ou débito na sua conta");
        }
    }

    public void depositar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Você fez o depósito no valor de " + valor + "e agora seu saldo é: " + this.getSaldo());
        }else{
            System.out.println("Você não tem conta aberta");
        }
    }

    public void sacar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Você não tem conta aberta");
        }
    }

    public void pagarMensal() {
        if (this.getStatus()) {
            if ("cc".equals(this.getTipo())) {
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Fez o pagamento de 12 reais, agora seu saldo é " + this.getSaldo());
            }else{
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Fez o pagamento de 20 reais, agora seu saldo é: " + this.getSaldo());
            }
        }else{
            System.out.println("Tu não tem conta aberta");
        }
    }
}
