class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length || k%nums.length==0){
            return;
        }else if(k>nums.length){
            while(k>nums.length){
                k=k-nums.length;
            }
        }
        int i=0;
        int j=nums.length-1;
        while(j>i){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int index=k-1;
        int m=0;
        int n=nums.length-1;
        while(index>m){
            int temp1=nums[m];
            nums[m]=nums[index];
            nums[index]=temp1;
            index--;
            m++;
        }
        index=k;
        while(n>index){
            int temp2=nums[index];
            nums[index]=nums[n];
            nums[n]=temp2;
            index++;
            n--;
        }
    }
}

