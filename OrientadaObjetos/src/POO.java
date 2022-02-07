import java.util.Scanner;

import entidades.Triangulo;

public class POO {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Coloque as medidas do Triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Coloque as medidas do Triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("Area do Triangulo x: %.4f%n", areax);
        System.out.printf("Area do Triangulo y: %.4f%n", areay);

        if(areax > areay){
            System.out.println("Area do x é maior");
        }else {
            System.out.println("Area do y é maior");
        }


        sc.close();


    }
}
