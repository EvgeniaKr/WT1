package P4;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = in.nextInt();
        in.close();

        int Mass[] = EnterMass(N);
        task(Mass, N);

    }
    static int task(int[] Mass, int N) {
        System.out.println();
        for (int i = 0; i<N; i++){
            boolean flag = true;
            for (int j = 2; j<Mass[i]; j++){
                if (Mass[i]%j==0){
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.print("  "+i);
            }
        }
        return 0;
    }
    static int[] EnterMass(int N){
        int[] Mass = new int[N];
        for (int i = 0; i < N; ++i){
            Mass[i] = (int) (Math.random()*100);
            System.out.println(Mass[i]);
        }
        return Mass;
    }

}
