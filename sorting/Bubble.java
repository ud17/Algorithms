import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] array = {90,50,30,60,80,20,10,40,70};

        // Arrays.toString(args arr)
        // to print an entire array
        System.out.print("Sorted array : " + Arrays.toString(algoBubbleSort(array)));
    }

    private static int[] algoBubbleSort(int[] arr) {
        int length = arr.length;

        for(int i=0; i<length-1; i++) {
            for(int j=0; j<length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
