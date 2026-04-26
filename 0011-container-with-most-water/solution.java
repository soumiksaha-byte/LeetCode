class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        int length=0;
        int hit=0;
        while(left<=right){
            length=right-left;
            if(height[left]>height[right]){
                hit=height[right];
                right--;
            }else{
                hit=height[left];
                left++;
            }
            if(max_area<hit*length){
            max_area=hit*length;}
        }
        return max_area;
    }
}
