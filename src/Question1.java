/*Write the following a functional interface and implement it using lambda:

    -> First number is greater than second number or not Parameter (int ,int ) Return boolean
   ->  Increment the number by 1 and return incremented value Parameter (int) Return int
    -> Concatination of 2 string Parameter (String , String ) Return (String)
    -> Convert a string to uppercase and return . Parameter (String) Return (String)
    */

@FunctionalInterface
interface GreaterCheck {
    boolean isGreater(int a, int b);
}


@FunctionalInterface
interface Increment {
    int increment(int a);
}


@FunctionalInterface
interface Concatenate {
    String join(String s1, String s2);
}

@FunctionalInterface
interface ToUpperCase {
    String convert(String s);
}

public class Question1 {
    public static void main(String[] args) {

        GreaterCheck greaterCheck = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5? " + greaterCheck.isGreater(10, 5));


        Increment increment = a -> a + 1;
        System.out.println("Increment 5: " + increment.increment(5));


        Concatenate concatenate = (s1, s2) -> s1 + s2;
        System.out.println("Concatenation: " + concatenate.join("Hello, ", "World!"));


        ToUpperCase toUpperCase = s -> s.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.convert("hello"));
    }
}
