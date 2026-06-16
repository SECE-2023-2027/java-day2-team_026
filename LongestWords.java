public class LongestWords {
        public static void main(String[] args) {
        String[] words = {"cat", "flag", "green", "country", "w3resource"};
    int max = 0;
        for (String word : words) {
            if (word.length() > max)
                max = word.length();
        }
        for (String word : words) {
            if (word.length() == max)
                System.out.println(word);
        }
    }
}