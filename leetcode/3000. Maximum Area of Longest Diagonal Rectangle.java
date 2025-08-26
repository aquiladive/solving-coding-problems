//3000. Maximum Area of Longest Diagonal Rectangle
//it takes more memory than the usual solutions (only beats 7.08% of solutions), but has good runtime (beats 96.00%)
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diagonalLength = 0, diagonalNum = 0;
        for(int i = 0; i < dimensions.length; i++) {
            if(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1] > diagonalLength) {
                diagonalLength = dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
                diagonalNum = i;
            }
        }
        int maxarea = dimensions[diagonalNum][0]*dimensions[diagonalNum][1];
        for(int i = diagonalNum; i < dimensions.length; i++) {
            if(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1] == diagonalLength)
                if(dimensions[i][0]*dimensions[i][1] > maxarea)
                    maxarea = dimensions[i][0]*dimensions[i][1];
        }
        return maxarea;
    }
}
