package DataStructures.DynamicPrograming;

public class KnapSack01 {
    int[][] dp;

    public KnapSack01(int[] weight, int capacity) {
        this.dp = new int [weight.length+1] [capacity+1];
    }

    private int knapSack(int[] weight, int[] val, int capacity){
        for (int i=0; i<=capacity;i++)
            dp[0][i] = 0;
        for (int i=0;i<=weight.length;i++)
            dp[i][0] =0;
        for(int i=1; i< weight.length + 1;i++){
            for(int j=1;j<capacity+1;j++){
                if(weight[i-1]<=j)
                    dp[i][j] = Math.max((val[i-1] + dp[i-1][j-weight[i-1]]),dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp [weight.length][capacity];
    }

    public static void main(String[] args) {
        int[] wt = { 60, 100, 120 };
        int[] val = { 10, 20, 30 };
        int W = 50;
        KnapSack01 ks = new KnapSack01(wt,W);
        System.out.println(ks.knapSack(val,wt,W));
    }
}
