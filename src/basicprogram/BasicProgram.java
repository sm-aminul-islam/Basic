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
    /*
    task2:Read a number n from user and find min and max and print min-max 
    */
    public static void task2(){
       Scanner  sc = new Scanner(System.in);
       System.out.printf("Enter  integer n:\n");
       int n=sc.nextInt();
       int min = Integer.MAX_VALUE;
       int max =Integer.MIN_VALUE;      
       for(int i =0;i<=n;i++)
       {
           int num =sc.nextInt();
           if(num<min){
               min=num;
           }
           if(num>max){
               max=num;
           }
          
       }
        int distance =max-min ;
        System.out.printf("Largest number :%d\n",distance);

        
        
    }

   
    public static void main(String[] args) {
        //task1();
        task2();
        
        
        
    }
    
}
