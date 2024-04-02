public class JPA506 {
    public static void main(String[] args) {
        System.out.printf("圓形面積為 : %.6f\n", calCircle(5));
        System.out.printf("三角形面積為 : %.6f\n", calTriangle(10, 5));
        System.out.printf("長方形面積為 : %d\n", calRectangle(5, 10));
        double totalArea = calCircle(5) + calTriangle(10, 5) + calRectangle(5, 10);
        System.out.printf("此圖形面積為 : %.6f\n", totalArea);
    }

    public static double calCircle(int n) {
        return (n * n * 3.1415926);
    }

    public static double calTriangle(int a, int b) {
        return ((a * b) / 2.0);
    }

    public static int calRectangle(int a, int b) {
        return a * b;
    }
}
