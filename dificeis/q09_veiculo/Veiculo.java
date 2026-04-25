public class Veiculo {
    private String modelo;
    private String tipo;
    private float preco;
    private final int id;

    public static int idAux = 1;
    public static int totalCadastrados = 0;

    public Veiculo(String modelo, String tipo, float preco) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.id = idAux;
        totalCadastrados++;
        idAux++;
    }

    public Veiculo(String modelo, String tipo) {
        this(modelo,tipo,0.0f);
    }
    public Veiculo(String modelo){
        this(modelo,"",0.0f);
    }
    public Veiculo() {
        this("indefinido", "", 0.0f);
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }
    public int getId(){
        return this.id;
    }
    public static int getProximoCadastro(){
        return idAux;
    }

    public static int getTotalCadastrados() {
        return totalCadastrados;
    }
    public String toString(){
        String r;
        r = "\nID: "+this.id+"\nModelo: "+this.modelo+"\nTipo: "+this.tipo+"\nPreço: "+this.preco;
        return r;
    }
}
