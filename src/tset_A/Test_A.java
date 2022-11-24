package tset_A;

public class Test_A {

    public int roll = 10;
    public static String name = "Akshay";


    public static void main(String args[]) throws Exception{

        Test_A obj =  new Test_A();

        System.out.println("I am inside main Function");
        obj.doAddition();
        System.out.println("The Roll num is ==>"+obj.roll);
        System.out.println("The name is ==>"+name);

        Substra();


    }




    public void doAddition() {

        System.out.println("I am doing addition");

    }

    public static void Substra() {

        System.out.println("I am doing Subs");

    }


}
