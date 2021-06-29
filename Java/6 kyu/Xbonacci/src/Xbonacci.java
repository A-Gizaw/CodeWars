import java.util.Arrays;

public class Xbonacci {
    public static Xbonacci INSTANCE;
    public static void main(String[] args) {
        INSTANCE = new Xbonacci();
        int n = 0;
        double[] f = new double[]{8,19,9};
        double[] s = new double[]{0,0,1};

        System.out.println(Arrays.toString(INSTANCE.tribonacci(f, n)));
        System.out.println(Arrays.toString(INSTANCE.tribonacci(s, n)));

    }
    public double[] tribonacci(double[] s, int n) {
        if(n<0||s.length<3) return null;
        if(n==0)return s;
        double[] ans = new double[n];
        double[] calc = s.clone();

        for (int i=0; i<s.length;i++){
            ans[i] = s[i];
        }

        for(int i=s.length; i< n; i++) {
            double next = 0;
            for (double d : calc) {
                next += d;
            }
            ans[i] = next;

            for (int j=0;j<3;j++){
                calc[j] = ans[i-2+j];
            }
        }

        return ans;
    }
}
