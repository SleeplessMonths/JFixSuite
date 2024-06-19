package java_6.problem_10C.subId_8996077;

import java.util.Scanner;
public class Digit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[10];
        for(int i = 1; i <= n ;i++){
            int sum = i % 9 == 0 ? 9 : i % 9;
            v[sum]++;
        }
        long res = 0;
        for(int i = 1; i < 10; i++){
            for(int j = 1 ; j < 10; j++){
                res += v[i] * v[j] * v[(i*j) % 9 == 0 ? 9 : (i*j) % 9];
            }
        }
        for(int i = 1; i <= n ; i++)
            res -= n / i;
        System.out.println(res);
    }
}