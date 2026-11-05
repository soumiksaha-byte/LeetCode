class Solution {
    public int[] searchRange(int[] nums, int x) {
        int i=0;
       int j=nums.length-1;
       int[]arr=new int[2];
       arr[0]=-1;
       while(i<=j){
        int mid=(i+j)/2;
        if(nums[mid]<x){
            i=mid+1;
        }else if(nums[mid]>x){
            j=mid-1;
        }else{
            arr[0]=mid;
            j=mid-1;
        }
       }
       i=0;
       j=nums.length-1;
       arr[1]=-1;
       while(i<=j){
        int mid=(i+j)/2;
        if(nums[mid]>x){
            j=mid-1;
        }else if(nums[mid]<x){
            i=mid+1;
        }else{
            arr[1]=mid;
            i=mid+1;
        }
       }
       return arr;
    }
}
