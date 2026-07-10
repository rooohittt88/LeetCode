import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int left=0;
        int right=len-1;
        int area=0;
        int maxarea=0;
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
            maxarea=Math.max(maxarea,area);

            if(height[left]<height[right])left++;
            else right--;
        }
        return maxarea;
    }
}