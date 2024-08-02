package ProjectEulerSolutions;

public class Euler009_SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        final int AplusBplusC ;
        AplusBplusC= 1000;

        // a^2 + b^2 = c^2
        // A+B+C = 1000;
        for (int A = 1; A < AplusBplusC; A++) {
            for (int B = A+1; B < AplusBplusC ; B++) {
                int C = AplusBplusC - B - A;
                if (Math.pow(A,2) + Math.pow(B,2) == Math.pow(C,2)){
                    System.out.printf("A B C %d %d %d\n",A,B,C);
                    long pdt = A * B * C;
                    System.out.printf("Sum is %d\n",(A+B+C));
                    System.out.printf("Product ABC = %d\n",pdt);
                }
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        if (estimatedTime <= 1e+9){
            System.out.println("Program took less than or equal to 1s");
        }else{
            System.out.println("Program took more than 1s, please try to simplify");
        }
    }
}
