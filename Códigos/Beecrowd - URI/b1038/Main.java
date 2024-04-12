package b1038;

import java.util.Scanner;

/*
1. entrada
    codigo pruduto = pedido
    quantidade = pedido
2. saída
    preço = pedido
3. objeto = pedido
 */
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Lanche cliente = new Lanche(sc.nextInt(), sc.nextInt());
        System.out.printf("Total: R$ %.2f", cliente.total());
    }
}
class Lanche {
    private int numero;
    private int quantidade;
    private double valor;
    public Lanche(int numero, int quantidade){
        this.numero = numero;
        this.quantidade = quantidade;
        especificacao();
    }
    public void especificacao(){
        if(this.numero == 1){
            this.valor = 4;
        }else if (this.numero == 2){
            this.valor = 4.50;
        }else if (this.numero == 3){
            this.valor = 5;
        }else if (this.numero == 4){
            this.valor = 2;
        } else if (this.numero == 5) {
            this.valor = 1.50;
        }
    }
    public double total(){
        return valor*quantidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
