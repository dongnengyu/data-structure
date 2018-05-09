/**
 * @param
 * @Author: 董能宇
 * @Email:dongnengyu@gmail.com
 * @Description:递归算法， 1、爬楼梯算法：已知一个楼梯有n个台阶，每次可以选择迈上一个或者两个台阶，求走完一共有多少种不同的走法。
 * 2、斐波那契数列：fibonacci
 * @Date: 2018/5/9
 */
public class Recursion {


    public static void main(String[] args) {

        float a = new Recursion().climbStairs(30);

        System.out.println(a);

        System.out.println(new Recursion().fibonacci(10));
    }


    public float climbStairs(int n) {
        float i = 1;
        if (n <= 0) {
            return 0;

        }
        if (n == 1) {
            return i;

        }
        if (n == 2) {
            i++;
            return i;
        } else
            return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }


    }
}
