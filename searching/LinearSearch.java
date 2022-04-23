public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {70,60,30,50,80,90,20,40,10};

        int index = findElementIndex(arr,80);

        System.out.print( index == -1 ? "Element not found" : "Element found at index :" + index);
    }

    private static int findElementIndex(int[] array, int element) {
        int left, right= array.length-1, index=-1;
        for(left =0; left <= right;) {

            if(array[left] == element) {
                index = left;
                break;
            }

            if(array[right] == element) {
                index = right;
                break;
            }
            left++;
            right--;
        }
        return index;
    }
}
