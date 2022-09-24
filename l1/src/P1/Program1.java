package P1;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        System.out.println("Введите y: ");
        double y = in.nextDouble();
        in.close();

        System.out.println(task(x,y));

    }
    static double task(Double x, Double y) {

        //System.out.println(y);
        Double b = x - ((2*x)/(1+Math.pow(x,2)*Math.pow(y,2)));
        if (b<0){
            b = b*(-1);
        }
        Double a = (1 + (Math.pow(Math.sin(x + y), 2)))/(2 + b) + x;
        return a;
    }
}
