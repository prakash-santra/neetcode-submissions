class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0; r<9; r++){
            HashSet<Character> seen = new HashSet<>();
            for(int i=0; i<9; i++){
                if(board[r][i] == '.')continue;
                if(seen.contains(board[r][i]))return false;

                seen.add(board[r][i]);
            }
        }

        for(int l=0; l<9; l++){
            HashSet<Character> seen = new HashSet<>();
            for(int i=0; i<9; i++){
                if(board[i][l] == '.')continue;
                if(seen.contains(board[i][l]))return false;

                seen.add(board[i][l]);
            }
        }

        for(int i=0; i<9; i++){
            HashSet<Character> seen = new HashSet<>();

            for(int r=0; r < 3; r++){
                for(int l=0; l<3; l++){
                    int row = (i / 3) * 3 + r;
                    int col = (i % 3) * 3 + l;

                    if(board[row][col] == '.')continue;
                    if(seen.contains(board[row][col]))return false;
                    
                    seen.add(board[row][col]);
                }
            }
        }
        return true;

    }
}
