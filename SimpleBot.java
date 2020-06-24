package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("R2", "2020");
        remindName();
        guessAge();
        guessAgeValidation();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        if (name.matches("\\w+")) {
            System.out.println("What a great name you have, " + name + "!");
        } else {
            System.out.println("Invalid input for name!");
            System.out.println("Please, enter again!");
            remindName();
        }
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Tell me the remainders of dividing your age by 3, 5 and 7.");
    }

    static void guessAgeValidation() {
        String rem3 = scanner.next();
        String rem5 = scanner.next();
        String rem7 = scanner.next();
        if (rem3.matches("\\d+") && rem5.matches("\\d+") && rem7.matches("\\d+")) {
            int reminderOf3 = Integer.parseInt(rem3);
            int reminderOf5 = Integer.parseInt(rem5);
            int reminderOf7 = Integer.parseInt(rem7);
            int age = (reminderOf3 * 70 + reminderOf5 * 21 + reminderOf7 * 15) % 105;
            System.out.println("Your age is " + age + "; that's a good time to start programming!");
            System.out.println("Next I will prove to you that I can count to any positive number you want.");
        } else {
            System.out.println("Invalid input for reminders");
            System.out.println("Please, enter again:");
            guessAgeValidation();
        }
    }

    static void count() {
        String num = scanner.next();
        if (num.matches("[1-9]+")) {
            int number = Integer.parseInt(num);
            for (int i = 0; i <= number; i++) {
                System.out.printf("%d!\n", i);
            }
        } else {
            System.out.println("Please, enter a positive number above zero");
            count();
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which of the following converts human readable file into platform independent code file in Java?");
        System.out.println("1. JVM\n" +
                "2. JRE\n" +
                "3. Applet\n" +
                "4. Compiler");
        while (scanner.nextInt() != 4) {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
