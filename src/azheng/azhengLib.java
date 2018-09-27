package azheng;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;
import java.lang.Math;
public class azhengLib
{
    public static void guessGameObj1() {
        int number = (int) (10.0 * Math.random());
        System.out.println("Type in your name");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        int guessedNum = 0;
        while (guessedNum != number) {
            System.out.println("Guess a number");
            Scanner searchNum = new Scanner(System.in);
            guessedNum = searchNum.nextInt();
        }
        if (guessedNum == number) {
            System.out.println(username + ", you guessed the number!");
        }
    }



    public static void guessGameUserGuess_Obj2() {
        int number = (int) (10.0 * Math.random());
        System.out.println("Type in your name");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        int guessedNum = 0;
        while (guessedNum != number) {

            System.out.println("Guess a number");
            Scanner searchNum = new Scanner(System.in);
            guessedNum = searchNum.nextInt();
            if (guessedNum < number) {
                System.out.println("The number is greater than what you guessed");
            } else {
                if (guessedNum > number) {
                    System.out.println("The number is less than what you guessed");
                }
            }
        }
        if (guessedNum == number) {
            System.out.println(username + ", you guessed the number!");
        }
    }


    public static void guessGameObj2() {
        int range = 10;
        int half = range / 2;
        String greater = "g";
        int lowHalf = half - 0;
        int highHalf = range - half;
        System.out.println("Pick a number from 1-" + range + ", i will guess. You just tell whether it is correct(type y) or greater(type g) or less than (type l)");
        System.out.println("type in your name");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        System.out.println(username + ", is you number " + half + "?");
        for (answer)
        Scanner ans = new Scanner(System.in);
        String answer = ans.nextLine();
        if (answer.equals(greater))
        {
            int newHalf = lowHalf/2;
            System.out.println(username + ", is you number " + newHalf + "?");

        }
    }


}

// package azheng;
// import java.util.Scanner;
// import java.lang.Math;
// public class azhengLib
// {
//     public static void guessGameObj1() {
//         int number = (int) (10.0 * Math.random());
//         System.out.println("Type in your name");
//         Scanner name = new Scanner(System.in);
//         String username = name.nextLine();
//         int guessedNum = 0;
//         while (guessedNum != number) {
//             System.out.println("Guess a number");
//             Scanner searchNum = new Scanner(System.in);
//             guessedNum = searchNum.nextInt();
//         }
//         if (guessedNum == number) {
//             System.out.println(username + ", you guessed the number!");
//         }
//     }



//         public static void guessGameObj2() {
//             int number = (int) (10.0 * Math.random());
//             System.out.println("Type in your name");
//             Scanner name = new Scanner(System.in);
//             String username = name.nextLine();
//             int guessedNum = 0;
//             while (guessedNum != number) {

//                 System.out.println("Guess a number");
//                 Scanner searchNum = new Scanner(System.in);
//                 guessedNum = searchNum.nextInt();
//                 if (guessedNum < number) {
//                     System.out.println("The number is greater than what you guessed");
//                 } else {
//                     if (guessedNum > number) {
//                         System.out.println("The number is less than what you guessed");
//                     }
//                 }
//             }
//             if (guessedNum == number) {
//                 System.out.println(username + ", you guessed the number!");
//             }
//         }
// }
