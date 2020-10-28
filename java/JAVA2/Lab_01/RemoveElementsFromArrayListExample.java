package JAVA2.Lab_01;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguage = new ArrayList<>();
        programmingLanguage.add("C");
        programmingLanguage.add("C++");
        programmingLanguage.add("Java");
        programmingLanguage.add("Kotlin");
        programmingLanguage.add("Python");
        programmingLanguage.add("Perl");
        programmingLanguage.add("Ruby");

        System.out.println("Initial List : " +programmingLanguage);

        programmingLanguage.remove(5);
        System.out.println("After remove(5) :" + programmingLanguage);

        boolean isRemoved = programmingLanguage.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguage);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguage.removeAll(scriptingLanguages);
        System.out.println("After removeALL(scriptingLanguage : "  + programmingLanguage);

        programmingLanguage.removeIf(n -> (n.charAt(0) == 'c' || n.charAt(0) == 'C'));

        System.out.println("After removing all elements that start with C : " + programmingLanguage);

        programmingLanguage.clear();
        System.out.println("After clear() : " + programmingLanguage);


    }
}
