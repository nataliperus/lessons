public class MyMath {
    public static int myMath(int c, int d, int[] a) {
        int rez = 0;
        for (int i=0; i< a.length; i++){
            if (a[i]>=c && a[i]<=d)
            {rez = rez+1;}
        }
        return rez;
    }
}
