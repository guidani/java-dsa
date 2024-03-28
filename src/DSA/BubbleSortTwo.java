/* Solution */
package DSA;
public class BubbleSortTwo {
    public static void main(String[] args) {
        int[] arr = {24, 3, 45, 7, 12, 9, 11, 3, 0, 123, 54, 14};
        int tamanho = arr.length;

        for (int i = 0; i < tamanho; i++) {
            boolean swapped = false;

            for (int j = 0; j < tamanho - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        // Exibir o array
        for (int i : arr){
            System.out.println(i);
        }
    }
}
