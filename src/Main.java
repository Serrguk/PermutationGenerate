class Main {
    public static int count = 0; // Счётчик количества перестановок

    // Вспомогательная функция для замены двух символов в массиве символов
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // Рекурсивная функция для генерации всех перестановок строки
    private static void permutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.print(String.valueOf(chars) + " ");
            count++;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void findPermutations(String str) {

        // базовый вариант
        if (str == null || str.length() == 0) {
            return;
        }
        permutations(str.toCharArray(), 0);
        System.out.println("\nКоличество перестановок: " + count);
    }

    // генерируем все перестановки строки
    public static void main(String[] args) {
        String str = "удавы";
        findPermutations(str);
    }
}
