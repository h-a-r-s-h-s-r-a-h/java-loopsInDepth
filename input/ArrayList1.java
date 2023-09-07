package input;

import java.util.ArrayList;

public class ArrayList1 {
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    ArrayList1(int... values){
        for(int i=0; i<values.length; i++){
            this.marks.add(values[i]);
        }
    }
    void print(){
        System.out.println(marks);
    }
    
}
