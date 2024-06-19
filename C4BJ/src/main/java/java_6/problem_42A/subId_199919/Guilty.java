package java_6.problem_42A.subId_199919;

import java.util.Scanner;

public class Guilty
{
    public static void main(String[] args) throws Exception
    {
        new Guilty();
    }

    public Guilty() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), V = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        int[] b = new int[N];
        for(int i = 0; i < N; i++)
            b[i] = sc.nextInt();

        int sum = 0;
        for(int elem: a) sum += elem;
        double x = Double.POSITIVE_INFINITY;
        for(int i = 0; i < N; i++)
            x = Math.min(b[i]/a[i], x);
        System.out.printf("%.4f\n", Math.min(x*sum + 1e-9, V));
    }
}