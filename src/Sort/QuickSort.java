package Sort;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @param
 * @Author: 董能宇
 * @Email:dongnengyu@gmail.com
 * @Description:
 * @Date: 2018/5/9
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {72, 6 ,57, 88, 60, 42, 83, 73, 48, 85};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array, int start, int end) {
        if(start > end) return;
        int i = start;
        int j = end;
        int x = array[i];
        while (i < j) {
            while(i < j && array[j] >= x) {
                j--;
            }
            if (i < j) {
                array[i] = array[j];
                i++;
            }

            while(i < j && array[i] < x) {
                i++;
            }
            if(i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = x;
        sort(array, start, i - 1);
        sort(array, j + 1, end);

    }
}
