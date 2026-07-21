import java.util.Arrays;

public class Main {
    static int findDuplicate(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
            return nums[i];
        }
        }
            return -1;

    }
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
        int[] array = {1,3,4,2,2};
        cyclicSort(array);
        int result = findDuplicate(array);
        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }
}