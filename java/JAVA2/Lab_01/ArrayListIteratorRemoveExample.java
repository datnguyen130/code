package JAVA2.Lab_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> numbersIteator = numbers.iterator();
        while (numbersIteator.hasNext()){
            Integer num = numbersIteator.next();
            if (num % 2 != 0){
                numbersIteator.remove();
            }
        }
        System.out.println(numbers);
    }
}
