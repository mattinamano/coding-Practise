//O(n^2)

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
    }
}


//O(n)

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, start = 0, end = height.length - 1;
        while (start < end) {
            maxarea = Math.max(maxarea, Math.min(height[start], height[end]) * (end-start));
            if (height[start] < end[r])
                start++;
            else
                end--;
        }
        return maxarea;
    }
}
