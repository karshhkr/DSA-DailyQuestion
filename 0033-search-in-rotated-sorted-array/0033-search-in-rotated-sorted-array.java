class Solution {
    public int search(int[] nums, int target) {
        
     int pivot = findPivot(nums);

        // array not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // target is pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // search in first half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // search in second half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // CASE 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // CASE 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // left side sorted
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }

            // right side sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}