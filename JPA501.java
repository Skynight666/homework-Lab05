import java.util.Scanner;
public class JPA501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (1>=n>=16):");
            int n = scanner.nextInt();
            if (n==999) {
                break;
            } else{
            System.out.printf(n + "的乘階= %d\n",fac(n));
            }
        }
    }
    public static int fac(int n) {
        if (n==0){
            return 1;
        } else {
            return n*fac(n-1);
        }
    }
}
