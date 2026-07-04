// import java.util.Scanner;

public class Main{
    static void max(int a,int b,int c){
        if(a > b && a > c){
            System.out.println("a is max");
        }else if(b > a && b > c){
            System.out.println("b is max");
        }
        else{
            System.out.println(("c is max"));
        }
    }
    public static int factorial(int num){
        int result  = 1;
        while(num > 1){
            result = result * num;
            num--;
        }
        return result;
    }
    static boolean  palindrome(int num){
        // String num1 = Integer.toString(num);
        int org = num;
        int b= 0;
        while(num>0){
            int a = num%10;
            // int b = 0;
            b = b*10 + a;
            num = num/10;
        }
        return org == b;

        
    }
    public static void main(String[] args){
        // hello();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter 3 numbers = ");
    // int a = input.nextInt();    
    // int b = input.nextInt();    
    // int c = input.nextInt();   
    // max(a,b,c); 
    // int num = 4;
    int num = 700;
    boolean d =palindrome(num);
    System.out.println(d);
    // int answer = factorial(num);
    // System.out.println(answer);
    // input.close();
    }
    // static void hello(){
    //     System.out.println("Hello World!");
    // }

}