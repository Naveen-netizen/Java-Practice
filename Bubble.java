import java.util.Arrays;

class Bubble{
    public static void main(String[] args) {
        int[] nums={-2,2,3,7,9,1,-2};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void BubbleSort(int[] arr){
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}