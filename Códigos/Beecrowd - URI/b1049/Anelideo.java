package b1049;

public class Anelideo extends Invertebrado{
    private String filo;
    private String classe;
    private String ordem;
    private String nome;
    public Anelideo(String filo, String classe, String ordem){
        this.filo = filo;
        this.classe=classe;
        this.ordem=ordem; //ou super(filo,classe)
        if(ordem.equals("hematofago")){
            System.out.println("sanguessuga");
        }else if(ordem.equals("onivoro")){
            System.out.println("minhoca");
        }
    }
}
