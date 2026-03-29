public class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, count = 0;

        // The Boyer-Moore algorithm works by maintaining a candidate and a count. 
        // When we see the candidate, we increment the count; 
        // otherwise, we decrement it. 
        // When the count reaches 0, we pick a new candidate. 
        // Since the majority element appears more than half the time, 
        // it will survive this elimination process and remain as the final candidate.

        for (int num : nums){
            if (count == 0){
                res = num; // pick candidate
            }
            count += (num == res) ? 1 : -1;
        }

        return res;
    }
}