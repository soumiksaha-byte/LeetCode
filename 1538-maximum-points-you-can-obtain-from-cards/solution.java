class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int windowSize= cardPoints.length-k;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int windowSum=0;
        for(int n:cardPoints){
            sum+=n;
        }
        for(int i=0;i<windowSize;i++){
            windowSum+=cardPoints[i];
        }
        min=windowSum;
        for(int j=windowSize;j<cardPoints.length;j++){
            windowSum+=cardPoints[j];
            windowSum-=cardPoints[j-windowSize];
            min=Math.min(min,windowSum);
        }
        return sum-min;
    }
}
