package java_6.problem_23A.subId_1992033;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            String in = scanner.next();
            int max = 0;
            for(int i=1;i<in.length();i++){
                if(in.indexOf(in.substring(0, i)) != in.lastIndexOf(in.substring(0, i))){
                    max = i;
                }
            }
            System.out.println(max);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}