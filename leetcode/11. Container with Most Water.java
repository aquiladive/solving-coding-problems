//11. Container with Most Water
//runtime beats 96.02%, memory beats 81.77%

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int length = 0, breadth = 0;
        int i = 0, j = height.length-1;

        while(i < j) {
            length = height[i] < height[j] ? height[i] : height[j];
            breadth = j-i;
            max = max > (length*breadth) ? max : (length*breadth);
            if(length == height[i])
                i++;
            else
                j--;
        }
        return max;
    }
}
