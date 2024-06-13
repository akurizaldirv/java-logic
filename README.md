# Tes PT. SHA Solo - Role Java
Akhmad Rizaldi Irvana

> source code ada di `/src/Main.java`

### 1. Berapa kali string `Hello` dicetak setelah pemanggilan `rusak(1000)`?
```java
public static void rusak(int n) {
    if (n == 0) {
        return;
    }

    for (int i = 1 ; i < n ; i++) {
        System.out.println("Hello");
    }

    rusak((int)n/2);
}
```
**Jawaban:**   1984 kali

### 2. Berapakah return value dari pemanggilan `roger(8,8)`?
```java
public static int roger(int k, int b) {
    if (b == 1) return 1;
    else if (k % b == 0) return 1 + roger(k, --b);
    else return 0 + roger(k, --b);
}
```
**Jawaban:**   4

### 3. Buatkan program yang akan menghitung jumlah uppercase, lowercase, angka dan symbol lainnya dalam suatu string.

Input

```text
pemrogramanDasarJava1
```

Output
```text
uppercase : 2
lowecase : 18
angka : 1
symbol : 0
```


**Jawaban:**
```java
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
```