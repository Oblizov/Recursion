import part7.Merge;

import java.util.Arrays;

public class Practis {

    public static void main(String[] args) {

       // System.out.println(factorial(4));
//        int result = FibonacciWishRotation.backRotation(5);
//        System.out.println("\n\n" + result);

        int[] re = {4, 5, 6, 3, 8, 4};
        //result = Merge.sort(result, 3, result.length);
        //System.out.println(Arrays.toString(result));

        recurUp(1);

        recurDown(1);

        System.out.println("\n" + factorial(6));



    }

    //простая рекурсия на возрастание
    public static void recurUp(int x){
        System.out.print(" " + x);

        if(x < 16){
            recurUp(x * 2);
        }
    }

    //простая рекурсия на убывание
    public static void recurDown(int x){
        if(x < 16){
            recurDown(x * 2);
        }

        System.out.print(" " + x);
    }



    //рекурсия с ветвлением
    public static int f(int x){
        System.out.print(" " + x);

        if(x == 0){
            return 0;
        }
        else if (x == 1){
            return 1;
        }
        else {
            return f(x -2) + f(x - 1);
        }
    }

    static int factorial(int x){
        int result;
        if (x == 1){
            return 1;
        }
        result = factorial(x - 1) * x;
        return result;
    }


}
