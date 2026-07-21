import java.util.ArrayList;
import java.util.List;

public class Main{
   
    static List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
       for(int i = 0; i<nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
       } 
       return ans;
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
        int[] array = {4,3,5,2,7,8,2,3,1,1};
        System.out.println(findDuplicates(array));
    }
}