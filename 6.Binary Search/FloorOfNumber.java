public class FloorOfNumber {
    static int smallest_nearest_no(int[] array , int target){
        int start = 0;
        int end = array.length-1;
         while(start<=end){

            int mid = (start+end)/2;
            
            if(array[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
       
        
        return end;
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,9,11,12,14,20,36,48};
        int target = 15;
        int result = smallest_nearest_no(array, target);
        System.out.println(result);
    }
}
