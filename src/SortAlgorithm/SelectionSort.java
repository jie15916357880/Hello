package SortAlgorithm;

import java.util.Arrays;

/**
 * Created by lm1 on 2018/4/3.
 */
public class SelectionSort {
    public static void selectionSort(int[] a){
        int len = a.length;
        int minIndex;
        int temp;
        for(int i=0;i < len;i++){
            minIndex=i;
            for(int j=i+1;j < len;j++){
                if(a[j] < a[minIndex]){
                    minIndex=j;
                }

            }
            if(minIndex != i) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        selectionSort(a);
    }
}
