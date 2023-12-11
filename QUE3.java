import java.util.Scanner;
public class QUE3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 5;

        for (int i = r; i >= 1; i--) {
            for (int j = r - i; j > 0; j--) {
                System.out.print("");
            }

            for (int k = i; k <= r; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}