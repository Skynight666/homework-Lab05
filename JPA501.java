import java.util.Scanner;
public class JPA501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (1>=n>=16):");
        int n = scanner.nextInt();
        int count =1;
            if (n==999) {
                break;
            } else {
                for (int i = 1; i <= n; i++) {
                    count *= i;
                }
            }
            System.out.println(n + "的乘階= "+count);
        } 
    }
}