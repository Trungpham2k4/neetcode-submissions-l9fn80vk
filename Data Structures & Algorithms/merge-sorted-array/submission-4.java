class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int firstPtr = m - 1;
        int secondPtr = n - 1;
        int thirdPtr = m + n - 1;
        while(firstPtr >= 0 && secondPtr >= 0){
            if(nums1[firstPtr] >= nums2[secondPtr]){
                nums1[thirdPtr] = nums1[firstPtr];
                firstPtr--;
            }else{
                nums1[thirdPtr] = nums2[secondPtr];
                secondPtr--;
            }
            thirdPtr--;
        }
        while(secondPtr >= 0){
            nums1[thirdPtr] = nums2[secondPtr];
            thirdPtr--;
            secondPtr--;
        }
    }
}