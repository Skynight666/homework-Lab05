public class JPA505 {
    public static int add(int a, int b) {
        System.out.println("Adding two integer: "+a+" , "+b);
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("Adding two doubles: "+a+" , "+b);
        return a + b;
    }

    public static String add(String a, String b) {
        System.out.println("Adding two Strings: "+a+" , "+b);
        return a + " " + b;
    }

    public static void main(String[] args) {
        int result1 = add(2, 3);
        double result2 = add(5.2, 4.3);
        String result3 = add("I love", "Java!!");
        
        System.out.print(result1 + " "); 
        System.out.printf("%.6f ", result2);
        System.out.print(result3); 
    }
}

