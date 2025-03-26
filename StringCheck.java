

public class StringCheck {
    public static void main(String[] args) {
        int a = 5;
        int b = a++; // a is assigned to b first, then incremented
        System.out.println("a: " + a); // 6
        System.out.println("b: " + b); // 5

        // int[] array={1,3,-1,-3,5,3,6,7};
        // ArrayList<Integer> answer=findMaximum(array, 3);
        // System.out.println(answer);
    }
    // static ArrayList<Integer> findMaximum(int[] arr,int n){
    // ArrayList<Integer> nums=new ArrayList<>();
    // for (int index = 0; index < arr.length; index++) {
    // int start=index;
    // int end= start+(n-1);
    // int max=arr[start];
    // if(end<arr.length){
    // for (int i = start; i <= end; i++) {
    // if(max<arr[i]){
    // max=arr[i];
    // }
    // }
    // nums.add(max);
    // }
    // else{
    // break;
    // }

    // }
    // return nums;
    // }
}
