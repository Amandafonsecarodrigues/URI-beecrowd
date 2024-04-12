package Pratica8;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.peso=peso;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("====== Apresentação do lutador ======");
        System.out.println("Nome: "+getNome());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Idade: "+getIdade());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("===== Fim da Apresentação =====");
    }

    public void ganharLuta(){
        setVitorias(this.vitorias++);
    }

    public void perderLuta(){
        setDerrotas(this.derrotas++);
    }

    public void empatarLuta(){
        setEmpates(this.empates++);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setCategoria() {
        if(this.peso<52.2){
            this.categoria= "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria="Leve";
        } else if (this.peso<=83.9) {
            this.categoria="Médio";
        } else if (this.peso <= 120.2) {
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }
    }

    public void status(){
        System.out.println("===== Status =====");
        setCategoria();
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
        System.out.println("=================");
    }

    public String getCategoria() {
        setCategoria();
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
