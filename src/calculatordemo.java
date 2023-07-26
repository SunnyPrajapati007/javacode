import java.util.Scanner;

public class calculatordemo {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("enter the number");
                int input = sc.nextInt();

                if(input == 1) {
                        System.out.println("Enter the first number");
                        int a = sc.nextInt();
                        System.out.println("enter the second number");
                        int b = sc.nextInt();
                        int result = main.sum(a,  b);
                        System.out.println("the sum of num1 and num2 is:"+result);

                }

                else if (input == 2) {
                        System.out.println("Enter the first number");
                        int a = sc.nextInt();
                        System.out.println("enter the second number");
                        int b = sc.nextInt();
                       int result = main.sub(a, b);
                        System.out.println("the subtration of two num :" +result);
                }
                else if (input == 3) {
                        System.out.println("Enter the first number");
                        int num1 = sc.nextInt();
                        System.out.println("enter the second number");
                        int num2 = sc.nextInt();
                        int mul = num1 * num2;
                        System.out.println("the multiplication of num1 and num2 is:" + mul);
                }
                else if (input == 4) {
                        System.out.println("Enter the first number");
                        int num1 = sc.nextInt();
                        System.out.println("enter the second number");
                        int num2 = sc.nextInt();
                        int div = num1 / num2;
                        System.out.println("the division of num1 and num2 is:" + div);
                }
                else if (input == 5) {
                        System.out.println("Enter the first number");
                        int num1 = sc.nextInt();
                        System.out.println("enter the second number");
                        int num2 = sc.nextInt();
                        int mod = num1 % num2;
                        System.out.println("the modulo of num1 and num2 is:" + mod);}
                else {
                        System.out.println("invalid output");
                }






                }


        }




