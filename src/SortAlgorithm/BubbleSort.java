package SortAlgorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lm1 on 2018/4/3.
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] a, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        int n = a.length;

        System.out.println(Arrays.toString(bubbleSort(a,n)));
    }
}
