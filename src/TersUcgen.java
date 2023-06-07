import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını giriniz :");
        int n = input.nextInt();

        for (int i = n ; i >= 0; i--) {
            for (var k = 1; k <= n - i ; k++) {
                System.out.print(" ");
            }
            for (var j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}