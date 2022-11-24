package tset_B;

public class Looping2 {

        //First Learn IF-ELSE back ...
        static int First_Class = 800 ;
        static int Pass_Mark = 300 ;
        public static void main(String args[]) throws Exception{
            Looping2 obj = new Looping2();

            //obj.testStudent_Grade(  301);
            obj.run_A_For_Loop(500);
        }
        public static void testStudent_Grade(int Student_Marks){
            if (Student_Marks>=First_Class){
                System.out.println("Congrats: You got First Class");
            }
            else if (Student_Marks<First_Class && Student_Marks>Pass_Mark){
                System.out.println("Congrats: You got Second Class");
            }
            else{
                System.out.println("Sorry You Fail in the Exam.....");
            }
        }
        public void run_A_For_Loop(int theMaxNum){
            for(int i=1 ; i<=theMaxNum ; i++){
                System.out.println("The Number Is ==>"+i);

        }
    }

}
