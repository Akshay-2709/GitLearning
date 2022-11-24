package tset_B;

import com.sun.jdi.connect.Connector;

public class Looping {
    //First Learn IF-ELSE back ...
    static int First_Class = 800;
    static int Pass_Mark = 300;

    public static void main(String args[]) throws Exception {
        testStudent_Grade(301);
    }

    public static void testStudent_Grade(int Student_Marks) {
        if (Student_Marks >= First_Class) {
            System.out.println("Congrats: You got First Class");
        } else if (Student_Marks < First_Class && Student_Marks > Pass_Mark) {
            System.out.println("Congrats: You got Second Class");
        } else {
            System.out.println("Sorry You Fail in the Exam.....");
        }
    }
}
