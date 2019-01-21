package thirtydays;

import java.util.*;


class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public String calculate() {
        double grade = Arrays.stream(testScores).average().orElse(0);
        if (90 <= grade && grade <= 100) {
            return "O";
        } else if (80 <= grade && grade < 90) {
            return "E";
        } else if (70 <= grade && grade < 80) {
            return "A";
        } else if (55 <= grade && grade < 70) {
            return "P";
        } else if (40 <= grade && grade < 55) {
            return "D";
        } else if (40 > grade) {
            return "T";
        }
        return "?";
    }

}

class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}