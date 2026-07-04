import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");

        int salary = 25000;
        if(salary > 10000){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // for(int i = 0 ; i<5 ; i++){
        //     System.out.println("Hello World "+i);
        // }
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter num");
        // int num  = input.nextInt();
        // for(int i = 0;i<num ; i++){
        //     System.out.println(i);
        // }

        System.out.println("Enter three numbers  = ");
        int a = input.nextInt();
        int b= input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println(" num  = " + a + "is largest number ");
        }
        else if(b>a && b>c){
        System.out.println(" num  = " + b + "is largest number ");
    }else{
        System.out.println("num = "+c+"is largest");
    }
    }
}