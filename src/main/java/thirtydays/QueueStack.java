package thirtydays;

import java.io.*;
import java.util.*;

class Solution8 {
    // Write your code here.
    private Queue<Character> characterQueue = new ArrayDeque<>();
    private Stack<Character> characterStack = new Stack<>();

    private Character dequeueCharacter() {
        return characterQueue.poll();
    }

    private Character popCharacter() {
        return characterStack.pop();
    }

    private void enqueueCharacter(char c) {
        characterQueue.add(c);
    }

    private void pushCharacter(char c) {
        characterStack.push(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution8 p = new Solution8();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}