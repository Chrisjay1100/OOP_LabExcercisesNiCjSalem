import java.util.function.Function;

public class Exer1_Functional {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = new Function<>() {
            @Override
            public Integer apply(Integer n) {
                return (n == 0) ? 1 : n * this.apply(n - 1);
            }
        };

        int number = 5;
        System.out.println("Factorial of " + number + " (Functional): " + factorial.apply(number));
    }
}
