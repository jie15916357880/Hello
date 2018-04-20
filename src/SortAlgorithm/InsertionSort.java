package SortAlgorithm;

import java.util.Arrays;

/**
 * Created by lm1 on 2018/4/3.
 */
public class InsertionSort {
    public static void insertionSort(int[] a){
        int len = a.length;
        int preIndex;
        int currentValue;
        for(int i = 1;i < len;i++){
            preIndex=i-1;
            currentValue = a[i];
            while (preIndex >=0 && a[preIndex] > currentValue){
                a[preIndex+1]=a[preIndex];
                preIndex--;
            }
            a[preIndex+1]=currentValue;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        insertionSort(a);
    }
}
