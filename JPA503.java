import java.util.Scanner;
public class JPA503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while (true) {
            System.out.print("Input m:");
            int m = scanner.nextInt();
            if (m==999) {
                break;
            } else {
                System.out.print("Input n:");
                int n = scanner.nextInt();
                System.out.printf("最大公因數= %d\n",fac(m,n));
            }
        }
    }
    public static int fac(int m,int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}

