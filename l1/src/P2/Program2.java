package P2;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        System.out.println("Введите y: ");
        double y = in.nextDouble();
        in.close();

        System.out.println(task(x,y));

    }
    static boolean task(Double x, Double y) {

        boolean flag = false;
        if (x>=-4&x<=4){
            if (y<=5&y>=0){
                flag = true;
            }
        }
        if (x>=-6&x<=6){
            if (y>=0&y>=-3){
                flag = true;
            }
        }

        return flag;
    }
}
