public class Atleta{
    private String nome;
    private String mol;
    private float pont;
    private int id;
    public static int idAux = 1;

    public Atleta(String nome, String mol, float pont){
        this.nome = nome;
        this.mol =  mol;
        this.pont = pont;
        this.id = idAux;
        idAux++;
    }
    public Atleta(String nome, String mol){
        this(nome,mol,0.0f);
    }
    public Atleta(String nome){
        this(nome,"indefinido",0.0f);
    }
    public Atleta(){
        this("indefinido","indenifinido",0.0f);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMol(String mol){
        this.mol = mol;
    }

    public String getMol(){
        return this.mol;
    }
    
    public void setPont(float pont){
        this.pont = pont;
    }

    public float getPont(){
        return this.pont;
    }
    public int getId(){
        return this.id;
    }
    public static int getProximoId(){
        return idAux;
    }

    public String toString(){
        String r;
        r = "\nNome: "+this.nome+"\nModalidade: "+this.mol+"\nPontuação: "+this.pont+"\nId:"+this.id;
        return r;
    }
}
