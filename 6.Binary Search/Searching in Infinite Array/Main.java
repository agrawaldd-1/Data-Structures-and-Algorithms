public class Main{
    static int search(int[] array , int target){
        int start = 0;
        int end = 1;
        while(target > array[end]){
            int newStart  = end+1;
            end = end + (end-start)*2;
            start = newStart;
        }
        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid]==target){
                return mid;
            }
            if(target>array[mid]){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 100;
        int result = search(array, target);
        System.out.println(result);
    }
}