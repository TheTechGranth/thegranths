package DataStructures.DynamicPrograming;

public class MinimumSubsetDifference {
    private int minSubsetDiff(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++) sum += arr[i];
        SubsetSum subsetSum = new SubsetSum(arr,sum);
        subsetSum.subsetSum(arr,sum);
        boolean[][] dp = subsetSum.getDp();
        int target = sum/2;
        for(int i=target;i>=0;i--){
            if (dp[arr.length-1][i])
                return sum-(2*i);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        MinimumSubsetDifference m = new MinimumSubsetDifference();
        System.out.println(m.minSubsetDiff(arr));
    }
}
