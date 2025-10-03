package ex_006_Ternary_oprator;

public class TaskRealAge {
    public static void main(String[] args) {

        int age=10;

        String result= (age<18) ? "Minor": (age<60)? "Adult": "Sr.Citizen";
        System.out.println(result);
    }
}
