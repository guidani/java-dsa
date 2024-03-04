// Time complexity: O(n²)
package DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 3, 45, 7, 12, 9, 11, 3, 0, 123,54, 14,24, 3, 45, 7, 12, 9, 11, 3, 0, 123,54, 14,24, 3, 45, 7, 12, 9, 11, 3, 0, 123,54, 14,24, 3, 45, 7, 12, 9, 11, 3, 0, 123,54, 14};
        int[] resp = exec(arr);
        for (int j : resp) {
            System.out.println(j);
        }
    }

    public static int[] exec(int[] arr){
        int changes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                continue;
            }
            if(arr[i] > arr[i + 1]){
                changes++;
                int a = arr[i];
                int b = arr[i + 1];
                arr[i] = b;
                arr[i + 1] = a;
            }
            if(changes > 0) exec(arr);
        }
        return arr;
    }
}
