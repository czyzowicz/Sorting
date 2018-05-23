import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 5;
        int[] d = new int[]{3, 4, 5, 1, 7};
        int x = 0;
        int i = 0;
        int j = n;
        while (j >= 1) {
            x = d[j - 1];
            i = j + 1;
            while (i <= n) {
                if (x <= d[i - 1]) {
                    d[i - 2] = x;
                    j--;
                    break;
                } else {
                    d[i - 2] = d[i - 1];
                    i = i++;
                }
            }
            break;
        }
        System.out.println(Arrays.toString(d));
    }
}
