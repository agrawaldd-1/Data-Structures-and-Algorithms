public class Main {
    static int RotationTimes(int[] array){
        int index = findPivot(array);
        int result = index+1;
        return result;
    }
    static int findPivot(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end &&array[mid] > array[mid+1]){
                return mid;
            }
            if(mid > start && array[mid] < array[mid-1]){
                return mid-1;
            }
            if(array[mid] <= array[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2,3};
        int result = RotationTimes(array);
        System.out.println(result);
    }
}
