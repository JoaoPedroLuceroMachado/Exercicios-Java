import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int Tmatriz = sc.nextInt();
        int[][] Matriz = new int[Tmatriz][Tmatriz];

        for(int i = 0; i < Tmatriz; i++){
            for(int j = 0; j < Tmatriz; j++){
                Matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Principal:");

        for(int i = 0; i < Tmatriz; i++){
            System.out.print(Matriz[i][i] + " ");
        }

        System.out.println();

        int cont = 0;

        for(int i = 0; i < Tmatriz; i++){
            for(int j = 0; j < Tmatriz; j++){
                if(Matriz[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("Quantidade de Negativos na Matriz: " + cont);



        sc.close();
    }
}
