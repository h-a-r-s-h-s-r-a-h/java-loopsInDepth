package bigdecimal;
import java.math.BigDecimal;
import  java.util.Scanner;
public class Division_of_no {
    private BigDecimal first_no;
    private BigDecimal second_no;
    
    Division_of_no(String first_no, String second_no){
        this.first_no = new BigDecimal(first_no);
        this.second_no = new BigDecimal(second_no);
    }
    void print_division(){
        BigDecimal final_value = first_no.divide(second_no);
        System.out.printf("Result is %.3f",final_value);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String first_no = input.next();
        String second_no = input.next();
        Division_of_no definite = new Division_of_no(first_no,second_no);
        definite.print_division();
    }
}
