package thirtydays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        try {
            System.out.println(Integer.valueOf(s));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

    }
}