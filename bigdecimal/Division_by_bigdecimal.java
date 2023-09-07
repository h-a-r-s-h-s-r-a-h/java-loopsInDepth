package bigdecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Division_by_bigdecimal {
    private BigDecimal first_no;
    private BigDecimal second_no;
    Division_by_bigdecimal(String first_no, String second_no){
        this.first_no = new BigDecimal(first_no);
        this.second_no = new BigDecimal(second_no);
    }
    void division_of_two_no(){
        BigDecimal final_result = first_no.divide(second_no,3,RoundingMode.UP);
        System.out.println(final_result);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :- ");
        String first_no = input.next();
        System.out.println("Enter second no :- ");
        String second_no = input.next();
        Division_by_bigdecimal definite = new Division_by_bigdecimal(first_no, second_no);
        definite.division_of_two_no();
    }
}
