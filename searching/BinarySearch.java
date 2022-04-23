public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};

        int index = binarySearch(arr, 0, arr.length - 1, 10);

        System.out.print( index == -1 ? "Element not found" : "Element found at index :" + index);
    }

    // recursion
    private static int binarySearch(int[] arr, int left, int right, int element) {

        if(right >= left) {
            // find mid each iteration
            int mid = left + (right-left)/2;
            if(arr[mid] == element)
                return mid;
            
            // check element belongs to which subarray
            // condition : element greater than mid element
            if(arr[mid] < element)
                return binarySearch(arr, mid + 1, right, element);
            
            // condition : element greater than mid element
            return binarySearch(arr, left , mid - 1, element);
        }
        return -1;
    }
}