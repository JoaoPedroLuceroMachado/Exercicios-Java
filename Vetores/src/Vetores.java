import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int TamanhoVetor = sc.nextInt();
        String [] nome = new String [TamanhoVetor];
        int [] idade = new int [TamanhoVetor];
        double [] altura = new double [TamanhoVetor];
        double somaaltura = 0;
        int pessoasmenores = 0;

        for(int i =0; i < TamanhoVetor; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        for(int i = 0; i < TamanhoVetor; i++){
            if(idade[i] < 16){
                pessoasmenores++;
            }
            somaaltura = somaaltura + altura[i];
        }

        double porcentagem = pessoasmenores * 100.0 / TamanhoVetor;
        double alturamedia = somaaltura / TamanhoVetor;
        
        System.out.printf("Altura média: %.2f%n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);



        sc.close();
    }
}
