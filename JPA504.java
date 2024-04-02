import java.util.Scanner;
public class JPA504 {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number:");
        int num = scanner.nextInt();
        System.out.printf("Ans:%d\n",fac(num));
    }
    public static int fac(int m) {
        if (m==1) {
            return 2;
        } else {
            sum=fac(m-1)+2*m;
            return sum;
        }
    }
}
