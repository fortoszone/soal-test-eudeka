import java.util.Scanner;

public class soal5 {
    public static void main(String[] args)
    {
        String str;
        StringBuilder strReversed = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan string");
        str = sc.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            strReversed.append(str.charAt(i));

        System.out.println("\n" + str + " di balik " + strReversed);

        if (str.equalsIgnoreCase(strReversed.toString()))
            System.out.println("Result True (karena palindrome)");
        else
            System.out.println("Result False (karena bukan palindrome)");
    }
}
