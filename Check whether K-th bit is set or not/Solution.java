import java.util.Scanner;
import java.lang.Integer;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        System.out.println(isKthBitSet(n, k));

    }

    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        String str = Integer.toBinaryString(n);
        char[] result = str.toCharArray();
        if (result[k] == '0') {
            return false;
        }
        return true;

    }
}