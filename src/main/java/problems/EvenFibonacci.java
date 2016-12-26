package problems;

import com.google.common.collect.Lists;

import java.util.List;

public class EvenFibonacci {

    public Integer findSumOfEvenValues(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> generateFibonacci(Integer limit) {
        int currentValue = 2;
        int previousValue = 1;
        List<Integer> sequence = Lists.newArrayList(previousValue, currentValue);

        while((currentValue + previousValue) < limit){
            Integer fibNumber = currentValue + previousValue;
            sequence.add(fibNumber);
            previousValue = currentValue;
            currentValue = fibNumber;
        }
        return sequence;
    }
}
