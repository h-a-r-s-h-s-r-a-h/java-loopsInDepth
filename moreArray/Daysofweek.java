package moreArray;
import java.util.Arrays;

public class Daysofweek {
    private String[] values;

    Daysofweek(String... value){
        this.values = value;
    }

    void days_printer(){
        System.out.println(Arrays.toString(values));
    }
    void reversed_days(){
        int length = values.length;
        for(int i=(length-1); i>=0;i--){
            System.out.println(values[i]);
        }
    }
    void most_noOfDays(){
        int len = values.length;
        String dayWithMostChar = "";
        for(int i=0;i<len;i++){
            if(values[i].length() > dayWithMostChar.length()){
                dayWithMostChar = values[i];
            }
        }
        System.out.println(dayWithMostChar);
    }
}
