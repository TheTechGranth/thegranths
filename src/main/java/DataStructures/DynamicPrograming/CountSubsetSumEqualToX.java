package DataStructures.DynamicPrograming;

public class CountSubsetSumEqualToX {
    int[][] dp;

    public CountSubsetSumEqualToX(int[] arr, int sum) {
        this.dp = new int [arr.length + 1][sum +1];
    }

    private int countSubset(int[] arr, int sum){
        for(int i=0;i<=sum;i++)
            dp[0][i] = 0;

        for(int i=0;i<=arr.length;i++)
            dp[i][0] = 1;

        for(int i=1;i<= arr.length;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                }else
                    dp[i][j] = dp[i-1][j];
            }
        }


        return dp[arr.length][sum];
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8,10};
        int X = 10;
        CountSubsetSumEqualToX c = new CountSubsetSumEqualToX(arr,X);
        System.out.println(c.countSubset(arr,X));
    }
}
