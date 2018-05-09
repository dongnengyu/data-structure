package WrittenTest;

import java.util.Scanner;

/**
 * @param
 * @Author: 董能宇
 * @Email:dongnengyu@gmail.com
 * @Description: 酷狗笔试题目 编程题
 * 小明去附近的水果店买橙子，水果商贩只提供整袋购买，有每袋6个和每袋8个的包装（包装不可拆分）。
 * 可是小明只想购买恰好n个橙子，并且尽量少的袋数方便携带。如果不能购买恰好n个橙子，小明将不会购买
 * 请根据此实现一个程序，要求：
 * <p>
 * 输入一个整数n，表示小明想要购买n（1≤n≤100）个橙子
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个橙子则输出-1
 * 例如，输入20，输出3。
 * @Date: 2018/5/10
 */
public class KuGouTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println("想买" + n + "个苹果");

        int x6 = n / 6;
        int x8 = n / 8;


        int count = 0;

        calculate:
        for (int i = 0; i <= x6; i++) {
            for (int j = 0; j <= x8; j++) {
                //System.out.println(i * x6 + j * x8);


                if ((i * 6 + j * 8) == n) {

                    count = i * 6 + j * 8;


                    System.out.println("买6个一袋的 " + i + " 袋  ");
                    System.out.print("买8个一袋的 " + j + " 袋");
                    System.out.println();
                    System.out.println("共" + (i + j) + "袋");

                    //算到袋数后直接跳出for
                    break calculate;
                }
            }


        }

        if (count == 0) {
            System.out.println("没有合适的");
        }


    }
}
