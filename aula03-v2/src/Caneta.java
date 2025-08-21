public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar(){
        if (!this.tampada){
            System.out.println("Riscando tudo");
        }else{
            System.out.println("Tem que destampar a caneta cara");
        }
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("A caneta foi tampada");
    }
    public void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada");
    }
}
