
class ex{
   public static String name (String s1) {
       return s1;
   }


    public static int name (int n){
        return n;

    }
    public static double name (double n){
        return n;

    }
}



public class methodex {
    public static void main(String[] args) {

        System.out.println(ex.name("ankit"));
        System.out.println(ex.name(10));
        System.out.println(ex.name("weight is 52.15"));

    }
}

