package ProjectEulerSolutions;



public class Euler006_SumSquareDifference {
    public static void main(String[] args) {
        int noOfNaturalNumbers = 100;
        long sumofSquares = 0L;
        long squareofSum;
        int sumofnumbers = 0;

        for (int i = 1; i <=noOfNaturalNumbers ; i++) {
            sumofnumbers = sumofnumbers + i;
            sumofSquares = sumofSquares + (long)Math.pow(i,2);
        }
        System.out.println("Sum of Squares of numbers = " + sumofSquares);
        System.out.println("Sum of numbers = " + sumofnumbers);
        squareofSum = (long)Math.pow(sumofnumbers,2);
        System.out.println("Square of sum of numbers = " + squareofSum);
        System.out.println("Sum Square Difference = " + (squareofSum - sumofSquares));
    }
}
