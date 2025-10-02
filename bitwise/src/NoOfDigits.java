public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        int result = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println((int)Math.log10(6498)+1);
        //for decimals we use base 10 by default
        System.out.println(result);
    }
}
