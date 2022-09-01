/**
 * @Auther: ZHU(lc))
 * @Date: 8/25/2022-08-25-4:38 PM
 * @Description：PACKAGE_NAME
 */
public class fibR {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    public static int fib(int n) {
        if(n <= 1){

            return n;
        }
        else{
//test
            return fib(n-1) + fib(n-2);
        }
    }
}
