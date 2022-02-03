import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int TamanhoVetor = sc.nextInt();
        double [] Vetor = new double [TamanhoVetor];

        for(int i = 0; i < TamanhoVetor; i++){
            Vetor[i] = sc.nextDouble();
        }

        




        sc.close();
    }
}
