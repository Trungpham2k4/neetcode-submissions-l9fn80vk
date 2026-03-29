class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr = 0; 
        int rightPtr = numbers.length - 1;
        int[] res = new int[2];
        while(true){
            if(numbers[leftPtr] + numbers[rightPtr] > target){
                rightPtr--;
            }else if(numbers[leftPtr] + numbers[rightPtr] < target){
                leftPtr++;
            }else{
                res[0] = leftPtr + 1;
                res[1] = rightPtr + 1;
                break;
            }
        }
        return res;
    }
}
