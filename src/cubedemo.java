import java.util.Scanner;

public class cubedemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int num = sc.nextInt();
        System.out.println("enter choice of limit");
        int limit = sc.nextInt();
        System.out.println("enter limit up to " + limit + ":");

        for (int i = 0; i < limit; i++) {
            int result = num * num * num;
            System.out.println(result);
        }

        
    }

}
