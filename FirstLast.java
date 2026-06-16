import java.util.Scanner;
import java.util.Vector;
public class FirstLast {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int first = arr.get(0);
        int last = arr.get(arr.size() - 1);
        if(first==last) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
