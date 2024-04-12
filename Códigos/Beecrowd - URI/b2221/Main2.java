package b2221;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int partidas = sc.nextInt();

        for(int i = 0;i<partidas;i++){
            int bonus = sc.nextInt();
            int ataque = sc.nextInt();
            int defesa = sc.nextInt();
            int level = sc.nextInt();


            Treinador dabriel = new Treinador("Dabriel",level); //level  //TEM Q TROCAR DE ORDEM PELO BEECROOOWDDDDD
            PokemonProfessor pokemon1 = new PokemonProfessor(dabriel, ataque, defesa); //ataque defesa

            ataque = sc.nextInt();
            defesa = sc.nextInt();
            level = sc.nextInt();
            Treinador guarte = new Treinador("Guarte", level);
            PokemonProfessor pokemon2 = new PokemonProfessor(guarte, ataque, defesa); //TROCAR ORDEM


            Batalha batalha = new Batalha(bonus, pokemon1, pokemon2); //bonus

            batalha.vencedor();
        }
    }
}

class Batalha {
    private int bonus;
    private PokemonProfessor pomekon1;
    private PokemonProfessor pomekon2;
    public Batalha(int bonus, PokemonProfessor pomekon1, PokemonProfessor pomekon2){
        this.bonus = bonus;
        this.pomekon1 = pomekon1;
        this.pomekon2 = pomekon2;
    }

    public void vencedor(){
        Treinador treinador;

        if (pomekon1.valorGolpe(bonus) > pomekon2.valorGolpe(bonus)) {
            treinador = pomekon1.getTreinador();
            System.out.println(treinador.getNome());
        } else if (pomekon2.valorGolpe(bonus) > pomekon1.valorGolpe(bonus)) {
            treinador = pomekon2.getTreinador();
            System.out.println(treinador.getNome());
        } else {
            System.out.println("Empate");
        }
    }

    public int getBonus(){
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public PokemonProfessor getPomekon1() {
        return pomekon1;
    }

    public void setPomekon1(PokemonProfessor pomekon1) {
        this.pomekon1 = pomekon1;
    }

    public PokemonProfessor getPomekon2() {
        return pomekon2;
    }

    public void setPomekon2(PokemonProfessor pomekon2) {
        this.pomekon2 = pomekon2;
    }
}
class PokemonProfessor {
    private int level;
    private int ataque, defesa;
    private Treinador treinador;

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesa() {
        return defesa;
    }

    public PokemonProfessor(Treinador treinador, int ataque, int defesa) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.treinador = treinador;
    }
    public int valorGolpe(int bonus) {
        if (treinador.getLevel() % 2 == 0) {
            return (getAtaque() + getDefesa())/2 + bonus;
        }else{
            return (getAtaque() + getDefesa()) / 2;
        }
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
class Treinador {
    private String nome;
    private int level;

    public Treinador(String nome, int level){
        this.level  =level;
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
}


