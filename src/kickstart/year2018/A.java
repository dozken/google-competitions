package kickstart.year2018;

import java.io.Console;
import java.util.Scanner;

public class A {

    private static void usingScanner()
    {
        System.out.println("Name: ");



        Scanner console = new Scanner(System.in);

        int testCaseCount = Integer.parseInt(console.nextLine());

        for (int i = 0; i < testCaseCount; i++) {
            int test = Integer.parseInt(console.nextLine());
            int result = solve(test);
            System.out.printf("Case #%d: %d", i, result);
        }

        console.close();

    }

    private static void usingConsoleReader() {
        Console console = System.console();
        if (console == null) {
            System.out.println("ne did");
            System.exit(0);
        }

        int testCaseCount = Integer.parseInt(console.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            int test = Integer.parseInt(console.readLine());
            int result = solve(test);
            System.out.printf("Case #%d: %d", i, result);
        }
    }

    private static int solve(int number) {
        int result = 0;

        int even = 0;

        for (int i = 0; number > 0; i++) {
            int digit = number % 10;
            number /=10;
            if(digit%2==0){
                even++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        usingConsoleReader();
//        usingScanner();
        System.out.println(7    %10);
    }
}
