class Solution {
    public boolean validPalindrome(String s) {
        if (s.length() <= 2) return true;
        
        int leftPtr = 0;
        int rightPtr = s.length() - 1;
        
        while (leftPtr < rightPtr) {
            if (Character.toLowerCase(s.charAt(leftPtr)) != Character.toLowerCase(s.charAt(rightPtr))) {
                return isPalindrome(s, leftPtr + 1, rightPtr) || isPalindrome(s, leftPtr, rightPtr - 1);
            }
            leftPtr++;
            rightPtr--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}