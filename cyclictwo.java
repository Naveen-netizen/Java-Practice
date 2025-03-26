public class cyclictwo {
    public static void main(String[] args) {
        int[] nums={1};
        int answer=firstMissingPositive(nums);
        System.out.println(answer);
    }
    public static int firstMissingPositive(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(correct>=0 && correct<arr.length && arr[i]!=arr[correct] ) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length +1;
       

       
    }
    private static void swap(int[ ] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}