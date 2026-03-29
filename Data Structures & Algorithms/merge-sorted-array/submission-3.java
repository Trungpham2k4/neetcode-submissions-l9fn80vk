class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int[] secondArr = new int[m+n];
        int firstPtr = 0;
        int secondPtr = 0;
        int thirdPtr = 0;
        while(firstPtr < m && secondPtr < n){
            if(nums1[firstPtr] <= nums2[secondPtr]){
                secondArr[thirdPtr] = nums1[firstPtr];
                firstPtr++;
            }else{
                secondArr[thirdPtr] = nums2[secondPtr];
                secondPtr++;
            }
            thirdPtr++;
        }
        while(firstPtr < m){
            secondArr[thirdPtr] = nums1[firstPtr];
            thirdPtr++;
            firstPtr++;
        }
        while(secondPtr < n){
            secondArr[thirdPtr] = nums2[secondPtr];
            thirdPtr++;
            secondPtr++;
        }
        for(int i = 0; i < m + n; i++){
            nums1[i] = secondArr[i];
        }
    }
}