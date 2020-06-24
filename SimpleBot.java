package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("R2", "2020");
        remindNameValidation();
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

    static void remindNameValidation() {
        String name = scanner.nextLine();
        if (name.matches("\\w+")) {
            System.out.println("What a great name you have, " + name + "!");
        } else {
            System.out.println("Invalid input for name!");
            System.out.println("Please, enter again!");
            remindNameValidation();
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
        boolean invalidInput = true;

        do {
            try {
                int reminderOf3 = Integer.parseInt(rem3);
                int reminderOf5 = Integer.parseInt(rem5);
                int reminderOf7 = Integer.parseInt(rem7);
                int age = (reminderOf3 * 70 + reminderOf5 * 21 + reminderOf7 * 15) % 105;
                System.out.println("Your age is " + age + "; that's a good time to start programming!");
                invalidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for reminders");
                System.out.println("Please, enter again:");
                guessAgeValidation();
            }
        } while (invalidInput);
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any positive number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
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
