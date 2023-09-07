package practise;

import java.util.Arrays;

public class Variable {
    private int[] values;
    Variable(int... value){
        this.values = value;
    }
    void print(){
        System.out.println(Arrays.toString(values));
    }
    
}
