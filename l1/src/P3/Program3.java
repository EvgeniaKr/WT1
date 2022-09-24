package P3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = in.nextDouble();
        System.out.println("Введите b: ");
        double b = in.nextDouble();
        System.out.println("Введите h: ");
        double h = in.nextDouble();
        in.close();

        task(a,b,h);

    }
    static double task(Double a, Double b, Double h) {

        while (a<=b){
            Double F = Math.tan(a);
            System.out.println("x = "+a+"; F(x) = "+F);
            a = a + h;
        }

        return 0;
    }
}
