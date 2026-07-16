import java.util.Arrays;

public class Main{
    static  void selectionSort(int[] array){
        for(int i = 0;i<array.length;i++){
            int last = array.length-i-1;
            int maxIndex = getMaxIndex(array, 0, last);
            int temp = array[maxIndex];
            array[maxIndex] = array[last];
            array[last] = temp;
        }
    }
    static int getMaxIndex(int[] array ,int start , int end){
        int max = start;
        for(int i = 0; i<=end;i++){
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {5,1,3,2,4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}