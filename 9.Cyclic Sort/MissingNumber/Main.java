public class Main {
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        for(int index = 0 ; index < nums.length ; index++){
            if(index != nums[index]){
                return index;
            }

        }
        return nums.length;
    }
     static void cyclicSort(int[] array){
        int i = 0;
        while(i < array.length){
            int correct = array[i];
            if(array[i]<array.length && array[i] != array[correct]){
                int temp = array[i];
                array[i] = array[correct];
                array[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
    
}
