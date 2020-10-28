package JAVA2.Lab_01;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(1);
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(4);
        firstFivePrimeNumber.add(5);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumber);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(6);
        nextFivePrimeNumber.add(7);
        nextFivePrimeNumber.add(8);
        nextFivePrimeNumber.add(9);
        nextFivePrimeNumber.add(10);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumber);

        System.out.println("firstTenNumber : " + firstTenPrimeNumbers );

    }
}
