package tset_B;

public class Variable_Learning {
    int roll = 10;
    public Variable_Learning(){

        System.out.println("This is Constructor #############");
    }
    public static void main(String args[]) throws Exception{
        Variable_Learning obj_1 = new Variable_Learning();
        System.out.println(addition_numbers(10,20,20));
        System.out.println(FullName("Rahul" , "Dravid"));
    }
    public  void Addition(){
        int empNo = 12345;
        System.out.println(roll);
        System.out.println(empNo);
    }
    public void Subs(){
        System.out.println(roll);
        //System.out.println(empNo);
    }
    public static int addition_numbers(int a , int b , int c){
        return a+b+c;
    }
    public static String FullName(String FName , String LName){
        return FName+" "+LName;
    }
}

