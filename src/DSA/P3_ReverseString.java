package DSA;

import java.util.Scanner;

public class P3_ReverseString {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The String I will reverse it");
        String userIpnut= sc.next();
        String reverse="";

        for(int i=userIpnut.length()-1;i>=0;i--){
            reverse=reverse + userIpnut.charAt(i);}
        System.out.println(reverse);
    }
}
