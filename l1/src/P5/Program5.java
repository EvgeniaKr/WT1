package P5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = in.nextInt();
        in.close();


        int A[] = EnterMass(N);
        int numelements = task(A, N);
        System.out.println("Необходимо убрать минимум " + numelements + " элементов");


    }

    static int task(int A[], int N){
        int Mass1[] = new int[N];
        int Mass2[] = new int[N + 1];

        int a = 0;
        for (int i = 0; i < N; ++i) {
            int b = 1;
            int c = a + 1;
            while (b < c) {
                int j = b + (int) Math.floor((c - b) / 2.0);
                if (A[Mass2[j]] < A[i])
                    b = j + 1;
                else
                    c = j;
            }
            int d = b;

            Mass1[i] = Mass2[d - 1];
            Mass2[d] = i;

            if (d > a)
                a = d;
        }

        int MassFinal[] = new int[a];
        int k = Mass2[a];
        for (int i = a - 1; i >= 0; --i) {
            MassFinal[i] = A[k];
            k = Mass1[k];
        }

        return A.length-MassFinal.length;
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
