public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,4,7,3};
        System.out.println(ans(arr));

    }

    private static int ans(int[] arr) {
        int uniqueElement = 0;
        for(int num:arr){
            uniqueElement ^= num;
        }
        return uniqueElement;
    }
}
