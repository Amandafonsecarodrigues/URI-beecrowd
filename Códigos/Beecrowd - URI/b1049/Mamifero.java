package b1049;

public class Mamifero extends Vertebrado{
    private String filo;
    private String classe;
    private String ordem;
    private String nome;
    public Mamifero(String filo, String classe, String ordem){

        this.filo = filo;
        this.classe=classe;
        this.ordem=ordem; //ou super(filo,classe)
        if(ordem.equals("onivoro")){
            System.out.println("homem");
        }else{
            System.out.println("vaca");
        }
    }
}
