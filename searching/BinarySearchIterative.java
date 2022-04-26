public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90};

        int index = binarySearch(arr, 90);

        System.out.print( index == -1 ? "Element not found" : "Element found at index :" + index);
    }

    // iterative approach
    private static int binarySearch(int[] arr, int element) {
        int right = arr.length - 1, index=-1;
        for(int left=0; left<=right;) {
            int mid = left + (right-left)/2;
            if(arr[mid] == element){
                index = mid;
                break;
            }
            
            if(element > arr[mid])
                left = mid+1;
            else
                right = mid-1;    
        }
        return index;
    }
    
}
