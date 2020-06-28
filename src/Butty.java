public class Butty {

    private static int depth = 0;

    static void buttyRec(int x){
        in(x);

        if(check(x)){
            buttyRec(2 * x);
        }
        out(x);
    }

    public static boolean check(int x){
        spaces();
        System.out.println("(x < 15): " + (x < 15));
        return x < 15;
    }


    static void in (int x){
        spaces();
        System.out.println("(" + x + ")->");
        depth++;
    }

    static void out(int x){
        depth--;
        spaces();
        System.out.println("<-(" + x + ")");
    }
    private static void spaces(){
        for(int k = 0; k < depth; k++){
            System.out.print("  ");
        }
    }

}
