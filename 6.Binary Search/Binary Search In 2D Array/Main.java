
import java.util.Arrays;

public class Main {
    static int[] search(int[][] array , int target){
        int row = 0;
        int column = array.length-1;
        while(row < array.length && column>0){
            if(array[row][column] == target){
                return new int[]{row,column};
            }
            if(array[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] array= {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 29;
        int[] result = search(array, target);
        System.out.println(Arrays.toString(result));
    }
}
