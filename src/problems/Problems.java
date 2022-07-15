package problems;

import java.util.Arrays;

public class Problems {
    /*
     * Function: isPalindrome
     */
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        text = text.toLowerCase();
        return rec(text);
    }

    private static boolean rec(String text) {
        if (text.length() < 2) {
            return true;
        }
        return text.charAt(0) == text.charAt(text.length() - 1)
                && rec(text.substring(1, text.length() - 1));
    }

    /*
     * Function: minSplit
     */
    public static int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            int currCoin = coins[i];
            while (amount >= currCoin) {
                amount -= currCoin;
                count++;
            }
        }
        return count;
    }

    /*
     * Function: notContains
     */
    public static int notContains(int[] array) {
        int res = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == res) {
                res += 1;
            }
        }
        return res;
    }

    /*
     * Function: isProperly
     */
    public static boolean isProperly(String sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Function: countVariants
     */
    public static int countVariants(int stearsCount) {
        if (stearsCount < 0) {
            return 0;
        }
        if (stearsCount == 0) {
            return 1;
        }
        return countVariants(stearsCount - 1) +
                countVariants(stearsCount - 2);

    }

}


