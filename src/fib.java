import java.util.ArrayList;

/**
 * @Auther: ZHU(lc))
 * @Date: 8/23/2022-08-23-4:41 PM
 * @Description：PACKAGE_NAME
 */
public class fib {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }
    public static int fib(int n) {
        int[] fib = new int[n];
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n > 2) {
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib[n - 1];
    }
}
