package DataStructures.DynamicPrograming;

public class SubsetSum {

    boolean[][] dp;

    public SubsetSum(int[] wt, int sum) {
        this.dp = new boolean [wt.length+1][sum+1];
    }

    public boolean subsetSum(int[] wt, int sum){
        for(int i=0;i<=sum;i++){
            dp[0][i] = false;
        }
        for(int i=0;i<=wt.length;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<=wt.length;i++){
            for(int j=1;j<=sum;j++){
                if (wt[i-1]<=j){
                    dp[i][j] = dp[i-1][j-wt[i-1]] || dp[i-1][j];
                }else
                    dp[i][i] = dp[i-1][j];
            }
        }
        return dp[wt.length][sum];
    }

    public boolean[][] getDp() {
        return this.dp;
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 3, 7, 4};
        int sum = 12;
        SubsetSum subsetSum = new SubsetSum(a,sum);
        System.out.println(subsetSum.subsetSum(a,sum));
    }
}
