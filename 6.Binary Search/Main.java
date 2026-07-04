public class Main {
    static int binarySearch(int[] array , int target){
        if(array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 9;
        int result = binarySearch(arr , target);
        System.out.println(result);
    }
}
