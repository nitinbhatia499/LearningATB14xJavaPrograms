package DSA;

import java.util.Scanner;

/*Write a program that calculates and displays the letter grade for a given numerical score
        (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59*/
public class P2_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num=scanner.nextInt();
        char grade=' ';
        if(num>=90 && num<=100)
            grade='A';
        else if(num>=80 && num<=89)
            grade='B';
        else if(num>=70 && num<=79)
            grade='C';
        else if(num>=60 && num<=69)
            grade='D';
        else if(num>=0 && num<=59)
            grade='F';
        System.out.println("Grade of Student " + grade);

    }
}
