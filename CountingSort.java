import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arrayNew = new int[]{4, 5, 7, 6, 7, 4, 1, 2, 8, 9};
        int max = arrayNew[0];
        for (int a : arrayNew) {
            if (a > max)
                max = a;
        }
        System.out.println(max);
        int[] arrayCount = new int[max + 1];

        for (int i = 0; i < arrayNew.length; i++) {
            arrayCount[arrayNew[i]]++;
        }
        int indexator = 0;
        int[] resultArray = new int[arrayNew.length];
        for (int i = 0; i < arrayCount.length; i++) {
            for (int j = 0; j < arrayCount[i]; j++) {
                resultArray[indexator] = i;
                indexator++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
