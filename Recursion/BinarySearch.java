package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target=1;
        int ans=bianry(nums, target, 0, nums.length);
        System.out.println(ans);

    }

    static int bianry(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return bianry(arr, target, start, mid - 1);
        } else {
            return bianry(arr, target, mid + 1, end);
        }
    }
}
