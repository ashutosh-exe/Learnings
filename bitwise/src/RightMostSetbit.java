public class RightMostSetbit {
    public static void main(String[] args) {
        int n = 15;
        int rsb = n & -n;
        System.out.println(rsb);
    }
}
