package Algorithms;

public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,10,11,1,3,19,8,7};
        QuickSelect q = new QuickSelect();
        System.out.println("5th smallest element is ->" + q.getKthSmallestElement(arr,5, 0, arr.length-1));
    }

    private int getKthSmallestElement(int[] arr, int k, int low, int high) {
        int pivotPoint = getPivotPoint(arr,low,high);
        if(pivotPoint == k-1) return arr[pivotPoint];
        else if(pivotPoint < k-1) return getKthSmallestElement(arr,k,pivotPoint + 1,high);
            //4,5,10,11,1,3,19,8,7
            // 4 5 1 3 7 10 11 19 8
        else return getKthSmallestElement(arr,k,low,pivotPoint -1);
    }

    private int getPivotPoint(int[] arr, int low, int high) {
        int pivotElement = arr[high];
        int pivotPoint = low;

        for(int i= low;i<=high;i++){
            if(arr[i] < pivotElement){
                int tmp = arr[i];
                arr[i] = arr[pivotPoint];
                arr[pivotPoint] = tmp;
                pivotPoint++;
            }
            //4,5,10,11,1,3,19,8,7
            //4 5 1 11 10 3 19 8 7
            // 4 5 1 3 10 11 19 8 7
            //pivotPoint =5
            //i=5

        }
        int tmp = arr[pivotPoint];
        arr[pivotPoint] = arr[high];
        arr[high] = tmp;

        return pivotPoint;
    }
}
