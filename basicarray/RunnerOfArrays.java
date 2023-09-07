package basicarray;

public class RunnerOfArrays {
    public static void main(String[] args){
        int[] mark = {100,99,98,97,100};
        Arrays_practise definite = new Arrays_practise("Harsh", mark);
        System.out.println("no of marks "+definite.getNumberOfMarks());
        System.out.println("Sum of marks "+definite.getTotalSumOfMarks());
        System.out.println("Maximum marks "+definite.maximumMark());
        System.out.println("Minimum marks "+definite.minimumMark());
        System.out.println("Average "+definite.getaverage());

        
    }
    
}
