package exercise1;

public class Mynumber {

    private int number;

    Mynumber(int no){
        this.number = no;
    }

    boolean isPrime(){
        //guard check
        if(number==2){
            return true;
        }
        for(int i=0; i<=(number-1); i++){
            if(number % 2 == 0){
                return false;
            }
        }
        return true;
    }
    void sumUptoN(){
        int sum = 0;
        for(int j=0; j<=number;j++){
            sum = sum + j;
        }
        System.out.println(sum);
    }
    void sumofDivisors(){
        int sumofdivisor = 0;
        for(int i=2; i<=(number-1); i++){
            if (number % i ==0){
                sumofdivisor = sumofdivisor +i;
            }
        }
        System.out.println(sumofdivisor);
    }
    void printANumberTriangle(){
        for(int k=0; k<=number; k++){
            for(int l=1; l<=k; l++){
                System.out.printf("%d ",l);
            }
            System.out.println();
        }
    }
}
