import java.sql.SQLOutput;
import java.util.Scanner;

public class swithcalcdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to calculator");
        System.out.println("enter first number");
        double num1 = sc.nextDouble();
        System.out.println("enter second number");
        double num2 = sc.nextDouble();
        System.out.println("choose an operation");
        System.out.println("1: addition");
        System.out.println("2: subtraction");
        System.out.println("3: multiplication");
        System.out.println("4: divison");
        System.out.println("enter your choice");
        int input = sc.nextInt();
        double result;
        switch (input) {
        case 1:
                 result = num1 + num2;
                 System.out.println("the addition is:" + result);
                break;
         case 2:
                result = num1 - num2;
                System.out.println("the subtraction is:" + result);
                break;

         case 3:
                result = num1 * num2;
                System.out.println("the multiplication is:" + result);
                break;
         case 4:
                result = num1 / num2;
                System.out.println("the division is:" + result);
                break;

            default:
                System.out.println("invalid input");}


        }


    }

