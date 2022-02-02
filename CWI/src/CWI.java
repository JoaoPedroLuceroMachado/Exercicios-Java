import java.util.Scanner;


public class CWI {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double Tamanhoarq = sc.nextDouble();
        double TamanhoFormat = 0;

        double MB = Math.pow(1024, 2);
        double GB = Math.pow(1024, 3);
        double TB = Math.pow(1024, 4);
        double PB = Math.pow(1024, 5);
        double EB = Math.pow(1024, 6);
        double ZB = Math.pow(1024, 7);
        double YB = Math.pow(1024, 8);
        
         

        if(Tamanhoarq < 1024){
            TamanhoFormat = Tamanhoarq;
            System.out.printf("%.2f B", TamanhoFormat);
        }else if(Tamanhoarq >= 1024 && Tamanhoarq < MB){
            TamanhoFormat = Tamanhoarq / 1024;
            System.out.printf("%.2f KB", TamanhoFormat);
        }else if(Tamanhoarq >= MB && Tamanhoarq < GB){
            TamanhoFormat = Tamanhoarq / MB;
            System.out.printf("%.2f MB", TamanhoFormat);
        }else if(Tamanhoarq >= GB && Tamanhoarq < TB){
            TamanhoFormat = Tamanhoarq / GB;
            System.out.printf("%.2f GB", TamanhoFormat);
        }else if(Tamanhoarq >= TB && Tamanhoarq < PB){
            TamanhoFormat = Tamanhoarq / TB;
            System.out.printf("%.2f TB", TamanhoFormat);
        }else if(Tamanhoarq >= PB && Tamanhoarq < EB){
            TamanhoFormat = Tamanhoarq / PB;
            System.out.printf("%.2f PB", TamanhoFormat);
        }else if(Tamanhoarq >= EB && Tamanhoarq < ZB){
            TamanhoFormat = Tamanhoarq / EB;
            System.out.printf("%.2f EB", TamanhoFormat);
        }else if(Tamanhoarq >= ZB && Tamanhoarq < YB){
            TamanhoFormat = Tamanhoarq / ZB;
            System.out.printf("%.2f ZB", TamanhoFormat);
        }else if(Tamanhoarq >= YB){
            TamanhoFormat = Tamanhoarq / YB;
            System.out.printf("%.2f YB", TamanhoFormat);
        }


        sc.close();
    }
}
