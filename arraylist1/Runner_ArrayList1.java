package arraylist1;

public class Runner_ArrayList1 {
    public static void main(String[] args){
        ArrayList1 definite  = new ArrayList1(1,2,3,4,5,6,7,8);
        definite.print();
        System.out.println(definite.maximum_value());
        System.out.println(definite.minimumValue());
        definite.addnewMark(99);
        definite.removeMark(2);
    }
}
