package ex_006_Ternary_oprator;

import java.sql.SQLOutput;

public class Task21Sept {
    public static void main(String[] args) {

        int a=1;
        int b=31;
        int c=41;


        String result= (a>b && a>c) ? "A is Greater" : (b>c && b>a) ? "B is Greater" : "C is Greater";
        System.out.println(result);

    }
}
