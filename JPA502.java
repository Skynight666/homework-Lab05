import java.util.Scanner;
public class JPA502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (1>=n>=16):");
            int n = scanner.nextInt();
            if (n==999) {
                break;
            } else{
            System.out.printf(n + "的乘階(迴圈)= %d\n",fac(n));
            System.out.printf(n + "的乘階(尾迴圈)= %d\n",facTail(n,1));
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
    public static int facTail(int a,int b) {
        if (a==1) {
            return b;
        } else {
            return facTail(a-1,a*b);
        }
    }
}

