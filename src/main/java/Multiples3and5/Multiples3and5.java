package multiples3and5;

import com.google.common.collect.Lists;

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

        Integer answer = 0;
        for (List<Integer> multiple : multiples) {
            answer += multiple.stream().mapToInt(Integer::intValue).sum();

        }
        return answer;
    }
}
