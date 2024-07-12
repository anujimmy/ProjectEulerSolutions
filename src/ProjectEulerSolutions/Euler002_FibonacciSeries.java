package ProjectEulerSolutions;

public class Euler002_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Project Euler Problem 001 - Even fibonacci numbers");
        int i = 0;
        int j = 1;
        int maxfib = 4000000;
        int fibSum = 0;
        int newJ = 0;
        System.out.print("fibonacci series is "+ i + "," + j);
        while(newJ<maxfib){
            newJ = i+j;
            System.out.print(","+ newJ);
            if(newJ>maxfib){
                System.out.println("fibonacci number > "+ maxfib);
                System.out.println("sum of all even fibonacci numbers is " + fibSum);
                break;
            }
            if (newJ%2==0 && newJ<4000000){
                fibSum = fibSum + newJ;
            }
            i = j;
            j=newJ;

        }

    }
}
