public class SearchInRange {
    public static void main(String[] args) {
         int [] array = {18,12,9,14,77,50};
     int answer = linearSearch(array, 50 , 1 , 4);   
     System.out.println(answer);
    }
    static int linearSearch(int[] array , int target , int start , int end){
        // int num = 0;
        for(int i =start ; i<=end ; i++){
            if(array.length == 0){
                return -1;
            }
            if(array[i]== target){
                return i;
            }
            
        }
        return -1;
    }

}
