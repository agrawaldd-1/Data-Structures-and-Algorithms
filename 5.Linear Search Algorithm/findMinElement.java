public class findMinElement {
    public static void main(String[] args) {
        int[] array = {18,12,-7,3,14,28};
        int result = findMin(array);
        System.out.println(result);
    }
    static int findMin(int[] array){
        int element = array[0];
        if(array.length == 0){
            return -1;
        }
        for(int i = 1;i<array.length;i++){
            if(element > array[i]){
                element = array[i];
            }
        }
        return element;
    }
}
