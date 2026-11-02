class Solution {
    public void nextPermutation(int[] nums) {
        boolean flag=false;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                flag= true;
                for(int j=nums.length-1;j>=0;j--){
                    if(nums[j]>nums[i]){
                        int tem=nums[j];
                        nums[j]=nums[i];
                        nums[i]=tem;
                        break;
                    }
                }
                int n=nums.length-1;
                int m=i+1;
                while(m<n){
                    int temp= nums[m];
                    nums[m]=nums[n];
                    nums[n]=temp;
                    m++;
                    n--;
                }
            break;
            }
        }
        if(!flag){
            int i=0, j=nums.length-1;
            while(i<j){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j--;
                }
        }
    }
}
