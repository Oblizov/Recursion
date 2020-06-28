package part7;

import java.util.Arrays;

public class Merge {

    public static int[] sort(int[] array, int from, int len){
        if(len == 0){
            return new int [0];
        }
        else if (len == 1){
            return new int[] {array[from]};
        }
        else if (len == 2){
            if(array[from] < array[from + 1]){
                return new int[] {array[from], array[from + 1]};
            }
            else {
                return new int[] {array[from + 1], array[from]};
            }
        }
        else {
            int[] left = sort(array, from, len / 2);
            int [] right = sort(array, from + (len / 2), len - (len / 2));

            return merge(left, right);
        }
    }

    private static int[] merge (int[] a, int[] b){
        int result[] = new int[a.length + b.length];
        System.out.print(Arrays.toString(a) + " + " + Arrays.toString(b));
        System.out.println(" -> " + Arrays.toString(result));
        return result;
    }
}
