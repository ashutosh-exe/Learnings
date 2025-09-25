import java.util.Arrays;
import java.util.Scanner;

public class GreatestAndMin {
    static void swap(int[] arr,int first,int secoond){
        int temp = arr[first];
        arr[first] = arr[secoond];
        arr[secoond] = temp;
    }
    static int minInarr(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int maxInarr(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Greatest="+maxInarr(arr));
        System.out.println("Minimun:"+minInarr(arr));
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));       
    }
}
