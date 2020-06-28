public class FibonacciWishRotation {
    public static int rotation(int x){
        System.out.print( " " + x);
        if(x == 0){
            return 0;
        }
        else if (x == 1){
            return 1;
        }
        else if(x % 2 == 0){
            return rotation(x - 2) + rotation(x -1);
        }
        else {
            return rotation(x - 1) + rotation(x - 2);
        }
    }

    public static int backRotation(int x){
        int result = 0;
        if(x == 0){
            result = 0;
        }
        else if (x == 1){
            result = 1;
        }
        else if(x % 2 == 0){
            result = backRotation(x - 2) + backRotation(x -1);
        }
        else {
            result = backRotation(x - 1) + backRotation(x - 2);
        }
        System.out.print(" " + x);
        return result;
    }
}
