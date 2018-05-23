import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        }
    }
