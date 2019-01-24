package thirtydays;

import java.util.Arrays;
import java.util.Scanner;


class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] a) {
        this.elements = a;
    }

    void computeDifference() {
        maximumDifference = Arrays.stream(elements).max().getAsInt() - Arrays.stream(elements).min().getAsInt();
    }
}

class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}