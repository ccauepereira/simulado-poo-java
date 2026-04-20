import java.util.Scanner;
public class DemoJogador{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quant de jogadores: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Jogador [] j = new Jogador[n];
        
        for(int i = 0; i<n; i++){
            System.out.println("Nome dos jogadores: ");
            String nome = sc.nextLine();
            System.out.println("Gols dos jogadores: ");
            int gols = sc.nextInt();
            sc.nextLine();
            j[i] = new Jogador(nome,gols);
        }
        int cont = 0;
        for(int i = 0; i<n; i++){
            if(j[i].getGols()>10){
                cont++;
            }
        }
        System.out.println("Jogadores com mais de 10 gols: "+cont);
        
        float soma = 0;
        for(int i = 0; i<n; i++){
            soma += j[i].getGols();
        }
        System.out.println("Total de Gols: "+soma);
        
        System.out.println("Primeiro Jogador do time: "+j[0]+"|\nUltimo jogador do time: "+j[n-1]);
        
        for(int i = 0; i<n-1; i++){
            for(int k =0; k<n-1-i; k++){
                if (j[k].getGols() < j[k+1].getGols()) {
                Jogador temp = j[k];
                j[k] = j[k+1];
                j[k+1] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++){
          System.out.println("Nome: " + j[i].getNome() + " | Gols: " + j[i].getGols());
        }
        sc.close();
    }
}