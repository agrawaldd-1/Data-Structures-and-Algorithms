public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Darshan";
        char letter = 's';
        boolean result = search(name , letter);
        System.out.println(result);
    }
    static boolean search(String str , char letter) {
        if(str.length() == 0){
            return false;
        }
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }
}
