package practiseagain;
import java.util.Arrays;

public class Days {
    private String[] values;

    Days(String... value){
        this.values = value;
    }

    void days_printer(){
        System.out.println(Arrays.toString(values));
    }
    void reversed_days(){
        int length = values.length;
        String[] revered = new String[length];
        String a1 = "";
        for(int i=(length-1),j=0;i>=0;i--,j++){
            a1 =  values[i];
            //for(int j=0; j<7; j++){
                revered[j] = a1;
            //}
            a1="";
        }
        System.out.println(Arrays.toString(revered));
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
