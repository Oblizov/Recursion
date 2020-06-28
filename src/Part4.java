public class Part4 {

    public static int f(int x){
        if(x < 2){
            return abc(x);
        }
        else{
            return a(x) + f(x -2) + b(x) + f(x -1) + c(x);
        }
    }

    public static int abc (int x){
        //System.out.print("a" + x + "b");
        System.out.print(x);
        return x;
    }

    public static int a (int x){
        //System.out.print("c" + x + "d");
        System.out.print("(" );
        return 0;
    }

    public static int b (int x){
        //System.out.print("e" + x + "f");
        System.out.print( "+" );
        return 0;
    }

    public static int c (int x){
        //System.out.print("g" + x + "h");
        System.out.print( ")" );
        return 0;
    }
}
