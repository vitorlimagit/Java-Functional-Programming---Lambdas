package programming;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListStructured(numbers);

        System.out.println(sum);

    }

    private static int addListStructured(List<Integer> numbers) {
        // how to loo?
        // how to store the sum?
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }

    private static void printAllNumberInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for(int number: numbers){
            System.out.println(number);
        }
    }

    private static void printEvenNumberInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for(int number: numbers){
            if(number %2 == 0){
                System.out.println(number);
            }
        }
    }


}
