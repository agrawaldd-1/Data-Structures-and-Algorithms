import java.util.Arrays;

public class SearchIn2DArray {
    static int[] linearSearch(int[][] array , int target){
        if(array.length == 0){
            return new int[]{-1,-1};
        }
        for(int i = 0; i<array.length ; i++){
            for(int j = 0 ; j<array[i].length ; j++){
                if(array[i][j]==target){
                    
                    return new int[]{i,j};
                }
                
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] array = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,55},
            {18,12}
        };
        int target = 34;
        int[] result = linearSearch(array , target);
        System.out.println(Arrays.toString(result));
    }
}
