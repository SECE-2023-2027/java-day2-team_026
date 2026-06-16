import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "wxyz";
        String str2 = "zyxw";
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));
    }
}