package tset_A;

public class Type_Casting {
    public static int  num = 10;
    //public static float  sal = 100.50;


    public static void main(String args[]) throws Exception {

        System.out.println("The Integer value: "+ num);

        double numDB = num;

        System.out.println("The Double value: "+ numDB);

        DoubleToInt();



    }

    public static void DoubleToInt() {


        double abc = 15.5;

        int i = (int)abc;
        System.out.println(i);


    }

    public static void int_to_String() {

        int abc = 50;

        String  i  = String.valueOf(abc);
        System.out.println(i);

        int j = Integer.parseInt(i);


    }









}

