package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        final List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //  printAllNumberInListFunctional(numbers);
        //printEvenNumberInListFunctional(numbers);
        //printSquaresOfEvenNumberInListFunctional(numbers);
        printCubeOfEvenNumberInListFunctional(numbers);

    }
    //    private static void print(int number){
//        System.out.println(number);
//        // teste
//    }

    private static void printAllNumberInListFunctional(List<Integer> numbers) {
        //[12,9,13,4,6,2,4,12,15]

        //What do do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }

    // number -> number %2 == 0
    private static void printEvenNumberInListFunctional(List<Integer> numbers) {
        //[12,9,13,4,6,2,4,12,15]
        //What do do?
        numbers.stream()
               // .filter(FP01Functional::isEven) // Filter - Only Allow Even Numbers
                .filter(number -> number %2 == 0)  // Lambda Expression
                .forEach(System.out::println); // Method Reference
    }

    private static void printSquaresOfEvenNumberInListFunctional(List<Integer> numbers) {

        numbers.stream()
                // .filter(FP01Functional::isEven) // Filter - Only Allow Even Numbers
                .filter(number -> number %2 == 0)  // Lambda Expression
                .map(number -> number * number)
                .forEach(System.out::println); // Method Reference
    }

    private static void printCubeOfEvenNumberInListFunctional(List<Integer> numbers) {

      numbers.stream()
              .filter(number -> number %2 !=0)
              .map(number -> number * number * number)
              .forEach(System.out::println);
    }

    //




}
