package Pratica9;


public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPag, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("==========================");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Pagina: "+this.pagAtual);
        System.out.println("Aberto: "+this.aberto);
        System.out.println("Leitor: "+this.leitor.getNome());
        System.out.println("Idade: "+leitor.getIdade());
        System.out.println("==========================");

    }
    public void abrir(){
        this.aberto = true;
    }
    public void fechar(){
        this.aberto = false;
    }

    @Override
    public void folhear() {

    }

    public void avancarPag(){
        this.pagAtual++;
    }
    public void voltarPag(){
        this.pagAtual--;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
