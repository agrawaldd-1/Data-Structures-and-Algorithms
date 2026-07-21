import java.util.Arrays;

public class Main{
    static void cyclicSort(int[] array){
        int i = 0;
        while(i < array.length){
            int correct = array[i]-1;
            if(array[i] != array[correct]){
                int temp = array[i];
                array[i] = array[correct];
                array[correct] = temp;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,1,5,2,4};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }
}