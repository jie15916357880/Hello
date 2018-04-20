package SortAlgorithm;

import java.util.Arrays;

/**
 * Created by lm1 on 2018/4/16.
 */
public class MergeSort {
    public static void merge(int[] a, int low, int mid, int high){
        int[] temp = new int[high - low +1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high){
            if (a[i] < a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while (i <= mid){
            temp[k++] = a[i++];
        }
        while (j <= high){
            temp[k++] = a[j++];
        }

        for(int k2 = 0; k2 < temp.length;k2++){
            a[k2 + low] = temp[k2];
        }
    }
    public static void mergeSort(int[] a,int low, int high){
        int mid = (low + high) / 2;
        if (low < high){
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0;i < 20;i++){
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before sort: " + Arrays.toString(a));
        mergeSort(a,0,a.length - 1);
        System.out.println("after sort: " + Arrays.toString(a));
    }
}
