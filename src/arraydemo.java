import java.util.Scanner;

public class arraydemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");
        int input = sc.nextInt();
        String car[] = new String[input];
        for (int i = 0; i < car.length; i++) {
            System.out.println("Enter car #" + (i + 1) + ":");
            car[i] = sc.next();}

        System.out.println("array elements");
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);

        }
    }}

