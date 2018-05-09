/**
 * @param
 * @Author: 董能宇
 * @Email:dongnengyu@gmail.com
 * @Description:递归算法
 * @Date: 2018/5/9
 */
public class Recursion {


    public static void main(String[] args) {

        float a = new Recursion().climbStairs(30);

        System.out.println(a);
    }



    public float climbStairs(int n){
        float i = 1;
        if (n<=0){
            return 0;

        }
        if (n==1){
            return i;

        }
        if (n==2){
            i++;
            return i;
        }
        else
            return climbStairs(n-1)+climbStairs(n-2);
    }
}
