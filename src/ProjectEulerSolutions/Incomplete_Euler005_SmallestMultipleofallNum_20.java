package ProjectEulerSolutions;

public class Incomplete_Euler005_SmallestMultipleofallNum_20 {
    public static boolean IsPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static long getLCM(int[] arrNum, int[] primeNum){
        long LCM = 1;
        for (int i = 1; i < primeNum.length ; i++) {
            int temp = primeNum[i];
            boolean IsMultiple = false;
            for (int j = 0; j < arrNum.length; j++) {
                if (arrNum[j] % temp == 0) {
                    arrNum[j] = arrNum[j]/temp;
                    IsMultiple = true;
                }
            }
            if (IsMultiple) {
                LCM = LCM * temp;
            }
        }
        return LCM;
    }

    public static void main(String[] args) {

        int arr_len = 10;
        int[] arrNum = new int[arr_len];
        StringBuilder sbPrime = new StringBuilder();
        StringBuilder sbNonPrime = new StringBuilder();
        long LCM = 1;
        for (int i = 0; i < arr_len; i++) {
            arrNum[i] = i + 1;
        }
        for (int i = 0; i < arr_len; i++) {
            if (IsPrime(i + 1)) {
                sbPrime.append(i + 1);
                sbPrime.append(",");
            }else{
                sbNonPrime.append(i+1);
                sbNonPrime.append(",");
            }
        }
        String[] arrPrimetemp = sbPrime.toString().split(",");
        int [] arrPrime = new int[arrPrimetemp.length];
        for (int K = 0; K < arrPrimetemp.length; K++) {
            int itemp = Integer.parseInt(arrPrimetemp[K]);
            LCM = LCM * itemp;
            arrPrime[K] = itemp;
        }
        String[] arrNonPrimetemp = sbNonPrime.toString().split(",");
        int[] arrNonPrime = new int[arrNonPrimetemp.length];
        for (int K = 0; K < arrNonPrimetemp.length; K++) {
            arrNonPrime[K] = Integer.parseInt(arrNonPrimetemp[K]);
        }

        long nonPrimeLCM = getLCM( arrNonPrime,arrPrime);

        LCM = LCM * nonPrimeLCM;

        System.out.printf("LCM of first %d natural numbers - %d",arr_len,LCM);
    }
}
