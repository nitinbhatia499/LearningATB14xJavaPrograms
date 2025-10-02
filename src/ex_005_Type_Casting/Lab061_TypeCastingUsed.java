package ex_005_Type_Casting;

public class Lab061_TypeCastingUsed {
    public static void main(String[] args) {

        int course=100;
        float f=15.45f;

        int result= course+(int) f;
        System.out.println(result);    // Narrowing- Explicit

        float result2= (float) course+f;
        System.out.println(result2); // Widening- Explicit
    }
}
