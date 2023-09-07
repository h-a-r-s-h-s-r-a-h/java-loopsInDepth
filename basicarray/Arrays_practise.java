package basicarray;
import java.math.BigDecimal;
import java.util.Arrays;

public class Arrays_practise {
    private String name;
    private int[] marks;

    Arrays_practise(String name,int[] marks){
        this.name = name;
        this.marks = marks;
    }
    int getNumberOfMarks(){
        return marks.length;
    }
    int getTotalSumOfMarks(){
        int sum = 0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        return sum;
    }
    int maximumMark(){
        int maximum = 0;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>maximum){
                maximum = marks[i];
            }
        }
        return maximum;
    }
    int minimumMark(){
        Arrays.sort(marks);
        return marks[0];
    }
    BigDecimal getaverage(){
        int sum = 0;
        for(int i =0; i<marks.length ; i++){
            sum = sum + marks[i];
        }
        int average = (sum / marks.length);
        BigDecimal final_sum = new BigDecimal(average);
        return final_sum;
    }
    
}
