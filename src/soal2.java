import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Format email wajib menggunakan ‘@’
// Format email wajib menggunakan tanda  titik ‘.’ setelah ‘@’
// Panjang email maksimum 20 karakter sebelum ‘@’
// domain yang diperbolehkan hanya “.co.id” dan “.id”

public class soal2 {
    public static void emailCheck(String email) {
        String re = "[A-Za-z0-9._]{3,20}+@\\.*(gmail|domain|yahoo)\\.*(co\\.id|id)";
        // Contoh email yang valid -> deva@.gmail.com
        // Karena format email wajib menggunakan tanda  titik ‘.’ setelah ‘@’

        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
            System.out.println(email + " --> valid");

        else
            System.out.println(email + " --> invalid");

    }

    public static void main(String[] args) {
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan email: ");
        email = sc.nextLine();

        emailCheck(email);

        // Contoh email yang valid -> deva@.gmail.com
        // Karena format email wajib menggunakan tanda  titik ‘.’ setelah ‘@’

    }
}