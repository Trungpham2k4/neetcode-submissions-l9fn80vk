class Solution {

    public int[] merge(int[] nums1, int[] nums2){
        if (nums1.length == 0) return nums2;
        if (nums2.length == 0) return nums1;
        int firstPtr = 0;
        int secondPtr = 0;
        int[] res = new int[nums1.length + nums2.length];
        int resPtr = 0;
        while(firstPtr < nums1.length && secondPtr < nums2.length){
            if (nums1[firstPtr] < nums2[secondPtr]){
                res[resPtr] = nums1[firstPtr];
                firstPtr++;
            }else{
                res[resPtr] = nums2[secondPtr];
                secondPtr++;
            }
            resPtr++;
        }
        while (firstPtr < nums1.length){
            res[resPtr] = nums1[firstPtr];
            resPtr++;
            firstPtr++;
        }
        while (secondPtr < nums2.length){
            res[resPtr] = nums2[secondPtr];
            resPtr++;
            secondPtr++;
        }
        return res;
    }

    public int[] mergeSort(int[] nums){
        if(nums.length <= 1){
            return nums;
        }
        int midIdx = nums.length / 2;
        int[] nums1 = Arrays.copyOfRange(nums, 0, midIdx);
        int[] nums2 = Arrays.copyOfRange(nums, midIdx, nums.length);
        return merge(mergeSort(nums1), mergeSort(nums2));
    }

    public int[] sortArray(int[] nums) {
        // Implement Merge Sort 
        return mergeSort(nums);
    }
}