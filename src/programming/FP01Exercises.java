package programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {

  //      final List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        printOddNumberInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS","PCF","Azure","Docker","Kubernetes");

        /*courses.stream()
                .forEach(System.out::println);*/

       /* courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);*/

       /* courses.stream()
                .filter(course -> course.length() >=4)
                .forEach(System.out::println);*/

        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printAllNumberInListFunctional(List<Integer> numbers) {
        //[12,9,13,4,6,2,4,12,15]

        //What do do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }

    private static void printOddNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                // .filter(FP01Functional::isEven) // Filter - Only Allow Even Numbers
                .filter(number -> number %2 != 0)  // Lambda Expression
                .forEach(System.out::println); // Method Reference
    }

}
