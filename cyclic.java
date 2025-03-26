import java.util.ArrayList;

public class cyclic {
    public static void main(String[] args) {
    int [] nums={4,3,2,7,8,2,3,1};
    ArrayList<Integer> Answer=findDuplicates(nums);
    System.out.println(Answer);
    }

     public static ArrayList<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPosition = arr[i] - 1;
            if (arr[i] != arr[correctPosition]) {
                int temp = arr[i];
                arr[i] = arr[correctPosition];
                arr[correctPosition] = temp;
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
              result.add(arr[j]);
            }
        }
        return result;
    }
}
