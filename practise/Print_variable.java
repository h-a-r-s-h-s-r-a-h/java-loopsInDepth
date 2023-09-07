package practise;

import java.util.Scanner;

public class Print_variable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many no. do you want to insert in array:- ");
        int a = input.nextInt();
        int aa[]=new int[a];
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            aa[i]=b;
        }
        Variable definite = new Variable(aa);
        definite.print();
        
    }
    
}
