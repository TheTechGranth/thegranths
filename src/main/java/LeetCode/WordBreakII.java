package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {
    Map<String, List<String>> map = new HashMap<String,List<String>>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<String>();
        if(s == null || s.length() == 0) {
            return res;
        }
        if(map.containsKey(s)) {
            return map.get(s);
        }
        if(wordDict.contains(s)) {
            res.add(s);
        }
        for(int i = 1 ; i < s.length() ; i++) {
            String t = s.substring(i);
            if(wordDict.contains(t)) {
                List<String> temp = wordBreak(s.substring(0 , i) , wordDict);
                if(temp.size() != 0) {
                    for(int j = 0 ; j < temp.size() ; j++) {
                        res.add(temp.get(j) + " " + t);
                    }
                }
            }
        }
        map.put(s , res);
        return res;
    }
}
