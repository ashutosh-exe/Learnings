public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isODD(69));
    }
    public static boolean isODD(int n){
        return (n&1) == 1;
    }
}
