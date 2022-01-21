package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int a:A){
            map.put(a,map.getOrDefault(a,0) + 1);
        }
        int[] majority = new int[1];
        map.forEach((k,v)->{
            if(v>=A.length/2) {
                majority[0]=k;
            }
        });
        return majority[0];
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] a = {1,1,2};
        m.majorityElement(a);
    }
}
