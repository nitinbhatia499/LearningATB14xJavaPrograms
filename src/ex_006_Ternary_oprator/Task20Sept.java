package ex_006_Ternary_oprator;

import java.util.Scanner;

public class Task20Sept {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
     int s= sc.nextInt();
        System.out.println(s);

     String s1= s%2==0 ? "Even Number": "Odd Number";
        System.out.println(s1);
    }
}
