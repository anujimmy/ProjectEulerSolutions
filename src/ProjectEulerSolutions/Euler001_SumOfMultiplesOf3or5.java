package ProjectEulerSolutions;

public class Euler001_SumOfMultiplesOf3or5 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Project Euler Problem 001 - Sum of all multiples of 3 or 5 under 1000");
        int iSum = 0;

        for (int i = 1; i<1000;i++){
            if (i%3 == 0 || i%5 == 0){
                iSum = iSum + i;
            }
        }
        System.out.println("Sum of all multiples of 3or5 under 1000 is " + iSum);
        long estimatedTime = System.nanoTime() - startTime;
        if(estimatedTime <= 1E+9){
            System.out.println("Program took less than or equal to 1S");
        }
    }
}
