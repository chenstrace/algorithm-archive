// submitted by lolatomroflsinnlos, modified by xam4lor
public class EuclideanAlgo {
    public static int euclidSub(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        
        return a;
    }
    
    public static int euclidMod(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }
}
