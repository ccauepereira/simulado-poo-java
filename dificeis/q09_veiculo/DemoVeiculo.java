import java.util.Scanner;
public class DemoVeiculo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQuant de veiculos: ");
        int n = sc.nextInt();
        sc.nextLine();

        Veiculo[] v = new Veiculo[n];

        for(int i = 0; i<n; i++){
            System.out.println("\nModelo: ");
            String modelo = sc.nextLine();
            System.out.println("\nTipo: ");
            String tipo = sc.nextLine();
            System.out.println("\nPreço: ");
            float preco = sc.nextFloat();
            sc.nextLine();
            v[i] = new Veiculo(modelo,tipo,preco);
        }

        float soma = 0.0f;
        for(int i = 0; i<n; i++){
            soma += v[i].getPreco();
        }
        System.out.println("\nTotal da frota: "+soma);

        Veiculo maior = v[0];
        for(int i = 1; i<n; i++){
            if(v[i].getPreco() > maior.getPreco()){
                maior = v[i];
            }
        }
        System.out.println("\nVeiculo mais caro: "+maior);
        float media = soma/n;
        System.out.println("\nMedia geral dos preços: "+media);

        int contCarros = 0;
        for(int i = 0; i<n; i++) {
            if (v[i].getTipo().equals("Carro")) {
                contCarros++;
            }
        }
        System.out.println("\nQuant de Carros: "+contCarros);
        int contMotos = 0;
        for(int i = 0; i<n; i++) {
            if (v[i].getTipo().equals("Moto")) {
                contMotos++;
            }
        }
        System.out.println("\nQuant de motos: "+contMotos);

        int contCaminhoes = 0;
        for(int i = 0; i<n; i++) {
            if (v[i].getTipo().equals("Caminhão")){
                contCaminhoes++;
            }
        }
        System.out.println("\nQuant de caminhão: "+contCaminhoes);

        int contCaros = 0;
        for(int i = 0; i<n; i++) {
            if (v[i].getPreco()>=50000.00f) {
                contCaros++;
            }
        }
        System.out.println("\nVeiculos acima de 50 mil: "+contCaros);

        Veiculo aux;
        for(int i =0; i<n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v[i].getPreco() < v[j].getPreco()) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("\nORDEM DESCRECENTE DE PREÇO");
        for(int i =0; i<n; i++){
            System.out.println("\nVeiculo "+(i+1)+": ");
            System.out.println(v[i]);
            }

        for(int i =0; i<n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v[i].getModelo().compareTo(v[j].getModelo()) > 0) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("\nORDEM ALFABETICA DE MODELO");
        for(int i =0; i<n; i++){
            System.out.println("\nModelo "+(i+1)+": ");
            System.out.println(v[i]);
        }

        System.out.println("\nProximo veiculo id: "+Veiculo.getProximoCadastro());
        System.out.println("\nTotal de veiculos cadastrados: "+Veiculo.getTotalCadastrados());
        sc.close();
    }
}
