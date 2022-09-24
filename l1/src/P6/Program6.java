package P6;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = in.nextInt();
        in.close();


        int A[] = EnterMass(N);
        task(A,N);


    }

    static void task(int A[], int N){
        //int a = 0;
        int[][] AFinal = new int[N][N];
        for (int i = 0; i<N; i++){
            int a = i;
            for (int j = 0; j<N; j++){
                if (a==N) {
                    a = 0;
                }
                AFinal[i][j] = A[a];
                System.out.print("  "+A[a]);
                a = a + 1;
            }
            System.out.println();
        }
    }

     static int[] EnterMass(int N){
        int[] Mass = new int[N];
        for (int i = 0; i < N; ++i){
            Mass[i] = (int) (Math.random()*100);
        }
        return Mass;
    }
}
