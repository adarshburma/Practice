import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> ans = new ArrayList<>();
        // sort array
        Arrays.sort(array);
        for (int i = 0; i < array.length-2; i++) {
            int newTarget = targetSum - array[i];
            List<Integer[]> triplets = findPair(i+1, array, newTarget, i);
            if(triplets.size() > 0) {
                ans.addAll(triplets);
            }
        }
        // Write your code here.
        return ans;
    }

    public static List<Integer[]> findPair (int stIdx, int[] arr, int newTarget, int curr) {
        List<Integer[]> triplets = new ArrayList<>();
        int endIdx = arr.length-1;
        while (stIdx < endIdx) {
            int sum = arr[stIdx] + arr[endIdx];
            if(sum > newTarget) {
                endIdx--;
            } else if (sum < newTarget) {
                stIdx++;
            } else {
                Integer[] triplet = new Integer[] { arr[curr], arr[stIdx], arr[endIdx]};
                triplets.add(triplet);
                stIdx++;
                endIdx--;
            }
        }
        return triplets;
    }
}
