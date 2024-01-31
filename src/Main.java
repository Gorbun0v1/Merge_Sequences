import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int[] a = new int[c];
        int[] b = new int[c];


        for (int i = 0; i < a.length; i++) {
            //a[i] = (i + 1) * (i + 1);
            a[i] = (int) Math.pow(i + 1, 2);
            b[i] = (int) Math.pow(i + 1, 3);
        }
        int[] result = new int[c];
        int l = 0, r = 0, d = 0;
        for (int i = 0; i < c; i++) {
            if (a[l] < b[r]) {
                result[d++] = a[l++];
            } else if (a[l] > b[r]) {
                result[d++] = b[r++];
            } else {
                result[d++] = a[l++];
                r++;}
        }
        System.out.println(result[c - 1]);
    }
}