package evenFibonacci;

import java.util.List;

public class EvenFibonacci {

    public Integer findSumOfEvenValues(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> generateFibonacci(Integer limit) {

        return null;
    }
}
