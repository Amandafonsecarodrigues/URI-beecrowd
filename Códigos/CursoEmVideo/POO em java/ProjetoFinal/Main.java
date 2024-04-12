package ProjetoFinal;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aprenda a fazer bolo");
        v[1] = new Video("Tire 10 em tudo");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Amanda",19,"Feminino","12345");

        System.out.println("============== Videos ===============");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println("============== Gafanhotos ===============");
        System.out.println(g[0].toString());
        g[0].viuMaisUm();
        System.out.println(g[0].toString());
        System.out.println("============== Dados ===============");
        Visualizacao vs = new Visualizacao(g[0],v[1]);
        System.out.println(vs.toString());
        vs.avaliar();
        vs.avaliar(35.0f);
        System.out.println(vs.toString());


    }
}
