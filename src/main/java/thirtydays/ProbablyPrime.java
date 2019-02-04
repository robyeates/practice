package thirtydays;

import java.util.Scanner;

public class ProbablyPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (scan.nextBigInteger().isProbablePrime(1)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        scan.close();
    }
}
