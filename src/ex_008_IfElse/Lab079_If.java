package ex_008_IfElse;

public class Lab079_If {
    public static void main(String[] args) {

        String UserInput= args[0];
        System.out.println(UserInput);
        int age=Integer.parseInt(UserInput);
        System.out.println(age);

        if(age>18)
        {
            System.out.println("Yes you can vote");
        }else{
            System.out.println("You cannot vote");
        }
    }
}
