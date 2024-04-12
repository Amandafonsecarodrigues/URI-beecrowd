package b2708;
/*
1. entrada
    movimento = jipe
    qtd pessoas = jipe
2. saida
    qtd pessoas fora = parque - controle do parque
    qtd jip fora = parque - controle do parque
 */
public class Parque {
    private int qtdPessoasFora;
    private int qtdJipFora;

    public void registraJip(String movimento, int qtdTurista){
        Jip jip = new Jip(movimento,qtdTurista);
        if(movimento.equals("SALIDA")){
            qtdPessoasFora += qtdTurista;
            qtdJipFora++;
        } else if (movimento.equals("VUELTA")) {
            qtdPessoasFora -= qtdTurista;
            qtdJipFora--;
        }
    }

    public int imprimirPessoa(){
        return qtdPessoasFora;
    }
    public int imprimirJip(){
        return qtdJipFora;
    }


}
