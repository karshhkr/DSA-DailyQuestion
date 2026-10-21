class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generate(
            int[] nums,
            int index,
            List<Integer> current,
            List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        //  1: do not include nums[index]
        generate(nums, index + 1, current, result);

        //  2: include nums[index]
        current.add(nums[index]);
        generate(nums, index + 1, current, result);

        // Undo the choice before returning
        current.remove(current.size() - 1);
    }
}