package problems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Test N1-5 */
        System.out.println("TEST isPalindrome");
        System.out.printf("text: %s - %b\n", "Madam", Problems.isPalindrome("Madam"));
        System.out.printf("text: %s - %b\n", "palindrome", Problems.isPalindrome("palindrome"));
        System.out.println();

        System.out.println("TEST isPalindromeRecursive");
        System.out.printf("text: %s - %b\n", "radar", Problems.isPalindromeRecursive("radar"));
        System.out.printf("text: %s - %b\n", "dog", Problems.isPalindrome("dog"));
        System.out.println();

        System.out.println("TEST minSplit");
        System.out.printf("amount: %d - %d\n", 7, Problems.minSplit(7));
        System.out.printf("amount: %d - %d\n", 4,Problems.minSplit(4));
        System.out.println();

        System.out.println("TEST notContains");
        int[]arr = {-3, 3, 4, 5};
        System.out.printf("%s - %d\n", Arrays.toString(arr), Problems.notContains(arr));
        arr = new int[]{-3, -6, 4, 1, 3, 2};
        System.out.printf("%s - %d\n", Arrays.toString(arr), Problems.notContains(arr));
        System.out.println();

        System.out.println("TEST isProperly");
        System.out.printf("sequence: %s - %b\n", "(()())", Problems.isProperly("(()())"));
        System.out.printf("sequence: %s - %b\n", "())()", Problems.isProperly("())()"));
        System.out.println();

        System.out.println("TEST countVariants");
        System.out.printf("stearsCount: %d - %d\n", 4, Problems.countVariants(4));
        System.out.printf("stearsCount: %d - %d\n", 7, Problems.countVariants(7));
        System.out.println();

        /* Test N6 */
        System.out.println("TEST FastRemoveDS");
        FastRemoveDS fastRemoveDS = new FastRemoveDS();
        fastRemoveDS.add(5);
        fastRemoveDS.add(6);
        fastRemoveDS.add(7);
        System.out.println(fastRemoveDS);
        fastRemoveDS.remove(6);
        System.out.println(fastRemoveDS);
    }
}
