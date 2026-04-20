public class Jogador{
    private String nome;
    private int gols;
    
    public Jogador(String nome, int gols){
        this.nome = nome;
        this.gols = gols;
    }
    
    public Jogador(String nome){
        this(nome,0);
    }
    public Jogador(Jogador j){
        this(j.nome,j.gols);
    }
    public Jogador(){
        this("indefinido",0);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setGols(int gols){
        this.gols = gols;
    }
    public int getGols(){
        return this.gols;
    }
    
    public String toString(){
        String r;
        r = "\nNome: "+this.nome+"\nGols: "+this.gols;
        return r;
    }
}