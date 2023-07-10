import java.util.Scanner;

public class demoweek {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num = 1;
  System.out.print("enter number 1-7, or press 0 to exit");
    num= sc.nextInt();
  if (num == 1){

      System.out.println("sunday");

      }

  else if (num == 2){
      System.out.println("monday");
  }
  else if (num == 3){
      System.out.println("tuesday");
  }
  else if (num == 4){
      System.out.println("wednesday");
  }
  else if (num == 5){
      System.out.println("thursday");
  }
  else if (num == 6){
      System.out.println("friday");
  }
  else if (num == 7){
      System.out.println("saturday");
  }
1
  else {
      System.out.println("not valid");
  }
  sc.close();



    }
}
