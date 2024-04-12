package b1049;

public class Ave extends Vertebrado{
    private String filo;
    private String classe;
    private String ordem;
    private String nome;
    public Ave(String filo, String classe, String ordem){
        this.filo = filo;
        this.classe=classe;
        this.ordem=ordem; //ou super(filo,classe)
        if(ordem.equals("carnivoro")){
            System.out.println("aguia");
        }else{
            System.out.println("pomba");
        }
    }
}
