class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if(i % 3 == 0 && j % 3 == 0){
                    if(!checkSmall3x3(board,i,j)) return false;
                }
                if(board[i][j] == '.') continue;
                
                for (int k = j + 1; k < 9; k++){ // horizontal
                    if (board[i][j] == board[i][k]) return false;
                }

                for (int k = i + 1; k < 9; k++){ // vertical
                    if (board[i][j] == board[k][j]) return false;
                }
            }
        }
        return true;
    }
    private boolean checkSmall3x3(char[][] board, int m, int n){
        HashSet<Character> set = new HashSet<>();
        for(int i = m; i < m + 3; i++){
            for(int j = n; j < n + 3; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
        return true;
    }
}
// board=[
//     [".",".",".",".","5",".",".","1","."],
//     [".","4",".","3",".",".",".",".","."],
//     [".",".",".",".",".","3",".",".","1"],
//     ["8",".",".",".",".",".",".","2","."],
//     [".",".","2",".","7",".",".",".","."],
//     [".","1","5",".",".",".",".",".","."],
//     [".",".",".",".",".","2",".",".","."],
//     [".","2",".","9",".",".",".",".","."],
//     [".",".","4",".",".",".",".",".","."]]


