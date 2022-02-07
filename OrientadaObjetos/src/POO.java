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

        double p = (x.a + x.b + x.c) / 2;
        double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
