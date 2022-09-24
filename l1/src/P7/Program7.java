package P7;

import java.util.Scanner;

public class Program7 {
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

        int i, j;

            for (i = 1; i < N; i++){
                j=i;
                int h=A[i];
                while ((j >= 1) && (A[j-1] > h)){
                    A[j]=A[j-1];
                    j -= 1;
                }
                A[j] = h;
            }

        for ( i = 0; i < N; ++i){
            System.out.print(A[i]+"  ");
        }
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
