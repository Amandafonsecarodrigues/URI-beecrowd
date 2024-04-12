package b1049;

public class Inseto extends Invertebrado{
    private String filo;
    private String classe;
    private String ordem;
    private String nome;
    public Inseto(String filo, String classe, String ordem){
        this.filo = filo;
        this.classe=classe;
        this.ordem=ordem; //ou super(filo,classe)
        if(ordem.equals("hematofago")){
            System.out.println("pulga");
        }else{
            System.out.println("lagarta");
        }
    }
}
