package tests.api;

import org.junit.jupiter.api.Test;

public class SimpleTests {
    @Test
    public void printDivision() {
        int a = 56;
        int b = 7;
        int c = a/b;
        System.out.println(c);;

    }

    @Test
    public void printWords() {
        String name = "Nikita";
        String surname = "Kuznecovs";
        String fullName = name + " " + surname;
        System.out.println(fullName);
    }
}