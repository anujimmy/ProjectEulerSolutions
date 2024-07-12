package ProjectEulerSolutions;

public class Euler004_LargestPalindromeNumber_3digits {
    public static boolean checkPalindrome(int iNo){
        int jNo = iNo;
        int ReverseNum = 0;
        //int noOfdigits = (int)Math.log10(iNo)+1;
        while(iNo != 0 ){
            int digit = iNo%10;
            ReverseNum = ReverseNum *10 + digit;
            iNo = iNo /10;
        }
        return ReverseNum == jNo;
    }
    public static void main(String[] args) {
        System.out.println("Project Euler Problem 004 - largest palindrome number made from product of 3 digit numbers");
        int iMax = 0;
            // i>=100 is not used as 100 * 100 is not a palindrome
            for (int i = 999;i>100;i--){
                // j = i used as  i*j  = j*i
                for(int j = i ; j>100; j--){
                    int iPdt = i * j;
                    // to store palindrome in a Max variable & do further palindrome check only if product > last Palindrome
                    if(checkPalindrome(iPdt) && iPdt > iMax) {
                        iMax= iPdt;
                        System.out.println("palindrome is " + iMax);
                    }
                }
            }
        System.out.println("largest palindrome is " + iMax);
    }
}
