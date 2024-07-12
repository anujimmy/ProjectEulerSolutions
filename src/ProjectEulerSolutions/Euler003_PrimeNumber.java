package ProjectEulerSolutions;

public class Euler003_PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Project Euler Problem 003 - largest prime factor");
        long X = 510510l;
        long bigPrime = 0;
        //check if number is divisible by 2
        while(X % 2 == 0){
            // Print the number of 2s that divide X
            System.out.print("2 ");
            X = X/2;
            bigPrime = 2;
        }
        while(X % 3== 0){
            // Print the number of 2s that divide X
            System.out.print("3 ");
            X = X/3;
            bigPrime = 3;
        }

        //atm X is odd
        for(int i = 5;i<= Math.sqrt(X);i+=6){
            while(X%i == 0){
                System.out.print( i + " ");
                X=X/i;
                bigPrime = i;
            }
            while(X%(i+2) == 0){
                System.out.print( (i+2) + " ");
                X=X/(i+2);
                bigPrime = i+2;
            }
        }
        if(X>2){
            System.out.print(X + " ");
            bigPrime = X;
        }
        System.out.println("Largest Prime - " + bigPrime);

    }
}