package problems;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;

public class Multiples3and5 {

    public List<Integer> findMultiplesOf(int mod, int limit) {
        List<Integer> results = Lists.newArrayList();
        for(int i = 1; i < limit; i++){
            if(i % mod == 0){
                results.add(i);
            }
        }
        return results;
    }

    public Integer sumValuesFromLists(List<Integer>... multiples) {
        HashSet<Integer> dedupe = new HashSet<>();
        for (List<Integer> multiple : multiples) {
            dedupe.addAll(multiple);
        }
        return dedupe.stream().mapToInt(Integer::intValue).sum();
    }
}
