package basicWhile;

public class While_practice {
    private int number;

    While_practice(int no){
        this.number = no;
    }

    void printSquaresuptoLimit(){
        int i = 0;
        int j = 1;
        while (i<=30 && j<=number){
            System.out.printf("%d ",(j*j));
            j=j+1;
            i = j * j;
        }
        System.out.println();
    }

    void printCubesUptoLimit(){
        int i = 0;
        int j = 1;
        while(i<=30 && j<=number){
            System.out.printf("%d ",(j*j*j));
            i = (j*j*j);
            j= j+1;
        }
    }
}

