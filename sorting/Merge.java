import java.util.Random;

public class Merge {
    
    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[10];

        // add random numbers to the array
        for(int i=0; i<nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }

        // Before Sorting
        System.out.println("Before Sorting");
        printArray(nums);

        mergeSort(nums);

        // After Sorting
        System.out.println("After Sorting");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for(int i = 0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void mergeSort(int[] input) {
        int length = input.length;

        if(length<2) return;

        int mid = length/2;

        int[] left = new int[mid];
        int[] right = new int[length-mid];

        for(int i=0; i<mid; i++) {
            left[i] = input[i];
        }

        for(int i=mid; i<length; i++) {
            right[i-mid] = input[i];
        }

        // divide into 2 halves
        mergeSort(left);
        mergeSort(right);

        // merge the sorted array
        merge(input, left, right);
    }

    private static void merge(int[] input, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;

        int i=0, j=0, k=0; 
        while(i < leftLength && j < rightLength) {
            if(left[i] <= right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftLength) {
            input[k] = left[i];
            k++;
            i++;
        }

        while(j < rightLength) {
            input[k] = right[j];
            k++;
            j++;
        }
    }


}
