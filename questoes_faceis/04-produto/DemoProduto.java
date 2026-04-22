import java.util.Scanner;
public class DemoProduto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto("Notebook",1200.5f);
        Produto p2 = new Produto("Celular");
        Produto p3 = new Produto();
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println("Produto 1: "+p1);
        System.out.println("Proximo codigo: "+Produto.getProximoCodigo());
        sc.close();
    }
}