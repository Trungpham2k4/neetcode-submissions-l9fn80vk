class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            int remainder = columnNumber % 26;
            int position = (remainder == 0 ? 26 : remainder) - 1;
            char letter = (char)('A' + position);
            sb.insert(0, String.valueOf(letter));
            if(columnNumber > 26) columnNumber = (columnNumber - 1) / 26;
            else break;
        }
        return sb.toString();
    }
}