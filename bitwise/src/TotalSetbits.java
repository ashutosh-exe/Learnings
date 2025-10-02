public class TotalSetbits {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(-n));
        System.out.println(setBit(n));
    }
    static int setBit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
