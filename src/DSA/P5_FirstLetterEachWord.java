package DSA;

import java.util.Scanner;

public class P5_FirstLetterEachWord {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String I will give first letter of Each word");
        String S1=  sc.nextLine();
        String[] arr =S1.split(" ");
        String Final="";
      for(String s:arr)
      {
          Final=Final+s.substring(0,1)+ " ";
      }
        System.out.println(Final);
    }
}
