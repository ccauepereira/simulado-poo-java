import java.util.Scanner;
public class DemoContaBancaria{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de contas: ");
        int n = sc.nextInt();
        sc.nextLine();
        ContaBancaria[] c = new ContaBancaria[n];
        
        for(int i=0; i<n; i++){
            System.out.println("\nDigite o nome do titular: "+(i+1)+ ": ");
            String titular = sc.nextLine();
            System.out.println("\nDigite o saldo do titular: "+(i+1)+": ");
            float saldo = sc.nextFloat();
            sc.nextLine();
            c[i] = new ContaBancaria(titular,saldo);
        }

        float total = 0.0f;
        for(int i=0; i<n; i++){
            total += c[i].getSaldo();
        }
        System.out.println("\nTotal de saldo: "+total);

        ContaBancaria maior = c[0];
        for(int i=1; i<n; i++){
            if(c[i].getSaldo()>maior.getSaldo()){
                maior = c[i];
            }
        }
        System.out.println("\nTitular com maior saldo: "+maior.getTitular());

        int cont = 0;
        for(int i=0; i<n; i++){
            if(c[i].getSaldo()>1000.0f){
                cont++;
            }
        }
        System.out.println("\nQuant de conta c saldo acima de 1k: "+cont);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(c[i].getSaldo()<c[j].getSaldo()){
                    ContaBancaria aux = c[i];
                    c[i] = c[j];
                    c[j] = aux;
                }
            }
        }
        System.out.println("\nContas ordenadas por saldo:");
        for(int i=0; i<n; i++){
            System.out.println(c[i]);
        }

        System.out.println("\nNumero da proxima conta:"+ContaBancaria.getNumAux());
        sc.close();
    }
}