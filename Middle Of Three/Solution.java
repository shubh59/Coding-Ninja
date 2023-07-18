import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        System.out.println(middelOfThree(x, y, z));
    }

    public static int middelOfThree(int x, int y, int z) {
        // Write your code here.
        int[] array = { x, y, z };
        Arrays.sort(array);
        return array[1];
    }
}