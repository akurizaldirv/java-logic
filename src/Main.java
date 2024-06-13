import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//         // Nomor 1
//        rusak(1000); // pemanggilan ini akan mencetak string 'Hello' sebanyak 1984 kali

//         // Nomor 2
//        System.out.println(roger(8,8)); // pemanggilan ini akan me-return nilai 4

//         // Nomor 3
        showCharCounter("pemrogramanDasarJava1");
    }

    public static void showCharCounter(String text) {
//        Initialize store
        Map<String, Integer> charCount = new HashMap<String, Integer>();
        charCount.put("uppercase", 0);
        charCount.put("lowercase", 0);
        charCount.put("symbol", 0);
        charCount.put("angka", 0);

//        Count every chars
        for (char ch : text.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) {
                    charCount.put("uppercase", charCount.get("uppercase") + 1);
                } else {
                    charCount.put("lowercase", charCount.get("lowercase") + 1);
                }
            } else if (Character.isDigit(ch)) {
                charCount.put("angka", charCount.get("angka") + 1);
            } else {
                charCount.put("symbol", charCount.get("symbol") + 1);
            }
        }

//        Print result
        System.out.println("uppercase : " + charCount.get("uppercase"));
        System.out.println("lowercase : " + charCount.get("lowercase"));
        System.out.println("angka : " + charCount.get("angka"));
        System.out.println("symbol : " + charCount.get("symbol"));
    }

    public static void rusak(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1 ; i < n ; i++) {
            System.out.println("Hello");
        }

        rusak((int)n/2);
    }

    public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }
}