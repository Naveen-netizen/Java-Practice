import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,0,6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int MaxIndex=getMaxIndex(arr, 0, last);
            swap(arr, MaxIndex, last);
        }
    }
    private static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int index = 0; index <=end; index++) {
            if(arr[max]<arr[index]){
                max=index;
            }
        }
        return max;
    }
}
