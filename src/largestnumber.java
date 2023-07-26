import java.util.Scanner;

public class largestnumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input;
        do{
        System.out.println("enter first number");
        int first_num = sc.nextInt();
        System.out.println("enter second number");
        int second_num = sc.nextInt();
        System.out.println("enter third number");
        int third_num = sc.nextInt();

        if (first_num >= third_num) {

            System.out.println("first number is large");
        } else if (first_num >= second_num) {
            System.out.println("first is large");


        } else if (second_num >= first_num && second_num >= third_num) {
            System.out.println("second is large");
        } else {
            System.out.println("third is highest");
        }
            System.out.println("press y to continue or n to exit");
            input = sc.next();

        }

while(input == "y");
        System.out.println("exited successfully");
        sc.close();

    }
}