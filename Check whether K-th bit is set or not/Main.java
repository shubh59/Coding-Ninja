import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int odd = 1;

            while (j <= n) {
                System.out.print(odd);
                odd = odd + 2;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}