import java.util.*;

public class enc {
    // Function to generate all subsets
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    // Recursive helper function
    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: if index reached end of array
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); // Add copy of current subset
            return;
        }

        // 1. Exclude current element
        generateSubsets(index + 1, nums, current, result);

        // 2. Include current element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, result);

        // Backtrack (remove last added element)
        current.remove(current.size() - 1);
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = findSubsets(nums);

        System.out.println("Subsets of " + Arrays.toString(nums) + ":");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
}
}
}