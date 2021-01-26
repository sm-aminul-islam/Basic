package basicprogram;

import java.util.Scanner;

public class BasicProgram {
    /*
    task1:input a and b two integer number from user and
     print the summation of the number
    */
    public static void task1()
    {
        Scanner  sc = new Scanner(System.in);
        System.out.printf("Enter two integer num:\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        for(int i =a;i<=b;i++){
            sum += i;
        }
        System.out.printf("Summation :%d\n",sum);
        
        
        
    }

   
    public static void main(String[] args) {
        task1();
        
        
        
    }
    
}
