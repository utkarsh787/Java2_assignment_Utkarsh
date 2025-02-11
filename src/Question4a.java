//WAP using java 8:
//
//    -> Collect all  even numbers from a list using stream
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Qustion4a {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}
