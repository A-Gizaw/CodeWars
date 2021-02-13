public class DigPow {

    public static void main(String args[]){
        System.out.println(digPow(1,2));
    }

    public static long digPow(int n, int p) {
        Integer i = n;
        String num = i.toString();

        int counter = 0;
        while(i>=1){
            counter++;
            i=i/10;
        }

        long total=0;
        for(int x=0;x<counter;x++){
            double number = Character.getNumericValue(num.charAt(x));
            total = (long) (total + (Math.pow( number, p)));
            p++;
        }

        long ans = total/n;
        if(ans >0){
            return ans;
        }
        return -1;
    }
}
