import java.util.Arrays;

public class Main {
    static void bubble(int[]array){
        for(int i = 0 ; i<array.length;i++){
            for(int j = 1;j<array.length;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {3,1,5,2,4};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
