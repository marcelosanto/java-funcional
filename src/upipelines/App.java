package upipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,8,9);

        Stream<Integer> st1 = list.stream().map(x -> x * x);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println(sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 ==0) // filtra os pares
                .map(x -> x * 10) // multiplica os pares vezes 10
                .collect(Collectors.toList()); // transforma em lista novamente
        System.out.println(newList);
    }
}
