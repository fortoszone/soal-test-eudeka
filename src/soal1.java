import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah integer: ");
        len = sc.nextInt();

        for (int i=1; i<=len; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Hello World");
            } else if (i % 3 == 0) {
                System.out.println("Hello");
            } else if (i % 5 == 0) {
                System.out.println("World");
            } else{
                System.out.printf("%d\n", i);
            }
        }
    }
}
