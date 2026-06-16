import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
