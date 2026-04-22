public class ContaBancaria{

    private String titular;
    private float saldo;
    private int num;
    public static int numAux = 1001;

    public ContaBancaria(String titular,float saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.num = numAux;
        numAux++;
    }
    public ContaBancaria(String titular){
        this(titular,0.0f);
    }
    public ContaBancaria(float saldo){
        this("indefinido",saldo);
    }
    public ContaBancaria(){
        this("indefinido",0.0f);
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public int getNum(){
        return this.num;
    }
    public static int getNumAux(){
        return numAux;
    }
    
    public String toString(){
        String r;
        r = "\nTitular: "+this.titular+"\nSaldo: "+this.saldo+"\nNúmero: "+this.num;
        return r;
    }

}