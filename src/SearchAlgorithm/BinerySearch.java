package SearchAlgorithm;

/**
 * Created by lm1 on 2018/4/9.
 */
public class BinerySearch {
    //使用循环
    public static int binarySearch(int[] a,int key){
        int low = 0;
        int high = a.length - 1;
        int mid ;
        while (low <= high){
            mid = (low + high) / 2;
            if(a[mid] > key){
                high = mid -1;
            }else if (a[mid] < key){
                low = mid + 1;
            }else{
                return a[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int result = binarySearch(a,4);
        System.out.println(result);
    }
}
