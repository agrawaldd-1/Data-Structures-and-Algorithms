public class OrderAgnosticBS{
    static int orderAgnostic(int[] array , int target){
        int start = 0;
        int end = array.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[start] < array[end]){
                if(array[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(array[mid]<target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] array = {48 , 36 , 20 , 14 , 12 , 11 , 9 , 6 , 4 , 2};
    int target = 4;
    int result = orderAgnostic(array, target);
    System.out.println(result);
}
}