package ProjectEulerSolutions;
import java.util.Scanner;
public class Euler007_nthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value for the Prime Number");
        int count_Prime = sc.nextInt();
//        int count_Prime = 10001;
        int iCount = 0;
        int i = 2;
        int nthPrime = 0;
        do {
            if(IsPrime(i)){
                nthPrime = i;
                iCount++;
            }
            i++;
        }while(iCount != count_Prime);
        System.out.println("nth Prime is - " + nthPrime);
    }

    public static boolean IsPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
