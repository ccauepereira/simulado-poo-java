public class Produto{
    private String nome;
    private float preco;
    private int codigo;
    public static int codAux;
    
    public Produto(String nome,float preco){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codAux;
        codAux++;
    }
    public Produto(String nome){
        this(nome,0.0f);
    }
    public Produto(float preco){
        this("",preco);
    }
    public Produto(){
        this("indefinido",0.0f);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public static int getProximoCodigo(){
        return codAux;
    }
    public String toString(){
        String r;
        r = "\nNome: "+this.nome+"\nPreço: "+this.preco+"\nIndendificado:"+this.codigo;
        return r;
    }
}