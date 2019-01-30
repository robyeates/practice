package thirtydays;

import java.util.*;
import java.io.*;

//Write your code here
class Calculator2 {

    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new NumberFormatException("n and p should be non-negative");
        }
        return Double.valueOf(Math.pow(n, p)).intValue();
    }
}


class Solution7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator2 myCalculator = new Calculator2();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
