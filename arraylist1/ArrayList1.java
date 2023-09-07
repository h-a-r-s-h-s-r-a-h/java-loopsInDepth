package arraylist1;
import java.util.ArrayList;
import java.util.Collections;

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
    int maximum_value(){
        return Collections.min(marks);
    }
    int minimumValue(){
        return Collections.max(marks);
    }

    void addnewMark(int new_mark){
        marks.add(new_mark);
        System.out.println(marks);
    }
    
    void removeMark(int removed_mark){
        marks.remove(removed_mark);
        System.out.println(marks);
    }
}
