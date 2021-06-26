package LeetCode;

import java.util.ArrayList;

public class FactorialOfLargeNUmber {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> result= new ArrayList<>();
        result.add(1);
        result.add(1);
        for(int i=2;i<=N;i++){
            result.add(i*result.get(i-1));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> r = factorial(1000);
        System.out.println(r.get(r.size()-1));
    }
}
