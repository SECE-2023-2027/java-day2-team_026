public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 2};
        int val = 6;
        int length = 0;
        for (int num : arr) {
            if (num != val) {
                arr[length++] = num;
            }
        }
        System.out.println("The length of the new array is: " + length);
    }
}