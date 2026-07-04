public class Main{
    static int linearSearch(int[] array , int target){
        // int num = 0;
        for(int i =0 ; i<array.length ; i++){
            if(array.length == 0){
                return -1;
            }
            if(array[i]== target){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
     int [] array = {18,12,9,14,77,50};
     int answer = linearSearch(array, 14 );   
     System.out.println(answer);
    }
}