package SortAlgorithm;

import java.util.Arrays;

/**
 * Created by lm1 on 2018/4/16.
 */
public class ShellSort {
    public static int[] shellSort(int[] data){
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < data.length; i++) {
                // System.out.println("i:" + i);
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    // System.out.println("j:" + j);
                    // System.out.println("temp:" + temp);
                    // System.out.println("data[" + j + "]:" + data[j]);
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }

        }
        return data;
    }

    public static void main(String[] args) {
        int[] a = new int[30];
        for(int i = 0;i < 30;i++){
            a[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(shellSort(a)));
    }

}
