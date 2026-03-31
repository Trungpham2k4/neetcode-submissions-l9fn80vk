class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int leftPtr = 0;
        int rightPtr = people.length - 1;
        int count = 0;
        while(leftPtr <= rightPtr){
            if(leftPtr == rightPtr){
                count++;
                break;
            }
            if (people[leftPtr] + people[rightPtr] > limit){
                count++;
                rightPtr--;
            }else if (people[leftPtr] + people[rightPtr] <= limit){
                count++;
                leftPtr++;
                rightPtr--;
            }
        }
        return count;
    }
}