package P8;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = in.nextInt();
        in.close();


        int A[] = EnterMass(N);
        System.out.println();
        int B[] = EnterMass(N);
        System.out.println();
        task(A, B, N);
    }

    static void task(int A[], int B[], int N){
        if (B[0]<=A[1]){
            A[0]=B[0];
            System.out.println("0");
        }
        for (int i = 1; i<N-1; i++){
            if (B[i]<=A[i+1]&B[i]>=A[i-1]){
                A[i]=B[i];
                System.out.println(i);
            }
        }
        if (B[N-1]>=A[N-2]){
            A[N-1]=B[N-2];
            System.out.println(N-1);
        }
    }

    static int[] EnterMass(int N){
        int[] Mass = new int[N];
        Mass[0] = (int) (Math.random()*100);
        System.out.print(Mass[0]+"  ");
        for (int i = 1; i < N; ++i){
            while (Mass[i-1]>Mass[i]) {
                Mass[i] = (int) (Math.random() * 100);
            }
            System.out.print(Mass[i]+"  ");
        }
        return Mass;
    }
}
