package exercise1;

import java.util.Scanner;

public class Mynumberrunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired no.");
        int desired_no = input.nextInt();
        Mynumber number =new Mynumber(desired_no);
        System.out.println("isPrime "+number.isPrime());
        number.sumUptoN();
        number.sumofDivisors();
        number.printANumberTriangle();
    }
}
