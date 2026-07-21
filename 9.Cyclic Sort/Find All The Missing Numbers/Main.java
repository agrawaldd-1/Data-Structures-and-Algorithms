import java.util.List;
import java.util.ArrayList;
public class Main {
     static void cyclicSort(int[] array){
        int i = 0;
        while(i < array.length){
            int correct = array[i]-1 ;
            if(array[i] > 0 && array[i] <= array.length && array[i] != array[correct]){
                int temp = array[i];
                array[i] = array[correct];
                array[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<nums.length;index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;   
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(nums);

    }
}
