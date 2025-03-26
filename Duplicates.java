import java.util.ArrayList;

public class Duplicates {
    public static void main(String[] args) {
    int[] nums={4,3,2,7,8,2,3,1};
    ArrayList<Integer> result=CyclicSort(nums);
    System.out.println(result);

    }

    static ArrayList<Integer> CyclicSort(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            int value = index + 1;
            while (arr[index] != value) {
                int correctPosition = arr[index] - 1;
                if (arr[correctPosition] != arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[correctPosition];
                    arr[correctPosition] = temp;
                } else {
                    if (!ans.contains(arr[index])) {
                        ans.add(arr[index]);
                    }
                    break;
                }

            }

        }
        return ans;
    }
}
