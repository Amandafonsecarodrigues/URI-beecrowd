package Pratica5;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public ContaBanco(){
        this.saldo=0;
        this.status = false;
    }
    public void abrirConta(String tipo){
        this.tipo = tipo;
        this.status = true;
        if(tipo.equals("CC")){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Tem saldo, não pode fechar");
        } else if (this.getSaldo()<0) {
            System.out.println("Você está devendo, não pode fechar");
        }else{
            this.status = false;
        }
    }
    public void depositar(float valor){
        if(this.status){
            this.setSaldo( getSaldo() + valor);
            System.out.println("Deposito executado");
        }else{
            System.out.println("Não permitido");
        }
    }
    public void sacar(float valor){
        if(this.status) {
            if (getSaldo() > valor) {
                this.setSaldo(getSaldo() + valor);
                System.out.println("Saque executado");
            } else {
                System.out.println("Não permitido por falta de dinheiro");
            }
        }else{
            System.out.println("Conta desativada");
        }
    }
    public void pagarMensal(){
        int v;
        if (this.tipo.equals("CC")){
            v = 12;
        }else{
            v=20;
        }
        if(status){
            saldo=saldo-v;
            System.out.println("Mensalidade paga");
        }else{
            System.out.println("Conta fechada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numConta=" + numConta + "\n, tipo='" + tipo + '\'' + "\n, dono='" + dono + '\'' +
                "\n, saldo=" + saldo +
                "\n, status=" + status +
                '}';
    }
}
