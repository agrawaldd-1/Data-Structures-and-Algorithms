
// import java.lang.reflect.Array;
// import java.lang.reflect.Array;
import java.util.Arrays;

public class practise {
    static void swap(int[] array , int index1 , int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        // array = {index1 , index2};
    }
    static int max(int[]array){
        int maxval = array[0];
        for(int i = 1;i<array.length ; i++){
            if(array[i]>maxval){
                maxval = array[i];
            }
        }
        return maxval;
    }
    static void reverse(int[]array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            swap(array , start , end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,6,8,9};
        swap(arr , 1 ,2);
        System.out.println(Arrays.toString(arr));
        int result = max(arr);
        System.out.println(result);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
