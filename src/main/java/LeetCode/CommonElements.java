package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    ArrayList<Integer> commonElm(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        int i=0,j=0,k=0;
        Set<Integer> result = new HashSet<>();
        while(i<n1 && j<n2 && k<n3){
            int val = Math.max(Math.max(A[i],B[j]),C[k]);
            while(A[i]< val) i++;
            while(B[j]<val) j++;
            while(C[k]<val) k++;

            if(A[i]==B[j] && A[i]==C[k]) {
                result.add(A[i]);
                i++;
                j++;
                k++;
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        CommonElements ce =new CommonElements();
        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b ={6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
        List<Integer> l = ce.commonElm(a,b,c,6,5,8);
        for(int i :l) System.out.println(i);
    }
}
