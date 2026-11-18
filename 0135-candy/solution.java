class Solution {
    public int candy(int[] ratings) {
        int [] leftToRight= new int[ratings.length];
        int [] rightToLeft=new int[ratings.length];
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            leftToRight[i]=1;
            rightToLeft[i]=1;
        }
        for(int j=1;j<ratings.length;j++){
            if(ratings[j-1]<ratings[j]){
                leftToRight[j]=leftToRight[j-1]+1;
            }
        }
        for(int k=ratings.length-2;k>=0;k--){
            if(ratings[k]>ratings[k+1]){
                rightToLeft[k] = Math.max(rightToLeft[k], rightToLeft[k+1] + 1);
            }
        }
        for(int n=0;n<ratings.length;n++){
            sum+=Math.max(leftToRight[n],rightToLeft[n]);
        }

        return sum;
    }
}
