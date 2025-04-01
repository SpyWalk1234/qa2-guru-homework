package tests.api;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

public class SoutTests {

    @Test
    public void task1() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("Together we are " + (sisterAge + brotherAge) + " years old!");
    }

    @Test
    public void task2() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("Together we are " + sisterAge + brotherAge + " years old!");
    }

    @Test
    public void task3() {
        int firstDistance = 150;
        int secondDistance = 1520;
        String unit = "km";

        firstDistance = 151;

        System.out.println("Total distance is:" + (firstDistance + secondDistance));
    }

    @Test
    public void task4() {
        Integer workingDays = 17;
        Integer totalDays = null;

        System.out.println("We have worked " + workingDays + " of " + totalDays);
    }

    @Test
    public void task5() {
        String price = "15.30";
        String currency = "EUR";
        BigDecimal totalPrice = new BigDecimal(price);

        System.out.println("Total price is:" + price + currency);
        System.out.println("Total price is: " + totalPrice + currency);
        System.out.println("Total price is:" + price + " " + currency);
    }

    @Test
    public void task6() {
        String prefix = "Is that your e-mail address?";
        String address = "test@test.lv";
        String postfix = "received";
        String end = "days ago";
        String days = "33";

        System.out.println(prefix + address + postfix + Integer.parseInt(days) + end);
    }

    @Test
    public void task7() {
        String prefix = "You passed";
        String distance = "7.5";
        String postfix = "km";

        System.out.println(prefix + " " + Integer.parseInt(distance) + " " + postfix);
    }

    @Test
    public void task8() {
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629");
        dateTime = dateTime.plusYears(3).plusDays(13).plusMinutes(15);

        System.out.println(dateTime.getDayOfMonth() + dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + dateTime.getYear());
    }

    @Test
    public void task9() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(LocalDateTime.parse("2019-12-15T15:14:21.629", formatter));
    }

    @Test
    public void task91() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629");

        System.out.println(dateTime.format(formatter));
    }

    @Test
    public void task92() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter frontendFormatter = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm");
        LocalDateTime frontendDateTime = LocalDateTime.parse("2022/12/24 00:00", frontendFormatter);

        System.out.println(frontendDateTime.format(formatter));
    }

    @Test
    public void task10() {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);
    }

    @Test
    public void task101() {
        LocalDateTime dateTime = LocalDateTime.parse("1970-01-01T00:01:00");

        System.out.println(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
    }

    @Test
    public void task11() {
        String firstCar = "Audi";
        String secondCar = "BMW";

        boolean amIAudiFan = true;

        if (amIAudiFan) {
            System.out.println("My car is " + firstCar);
        } else {
            System.out.println("My car is " + secondCar);
        }
    }

    @Test
    public void printRhymeTest() {
        System.out.println("""
                У лукоморья дуб зелёный;
                Златая цепь на дубе том:
                И днём и ночью кот учёный
                Всё ходит по цепи кругом;""");
    }

    @Test
    public void wordVariableTest() {
        String all = "Всем";
        String hello = "привет!";
        String lets = "Давайте";
        String study = "учиться";
        String together = "вместе!";

        System.out.println(all + " " + hello + " " + lets + " " + study + " " + together);
    }

    @Test
    public void symbolCountTest() {
        String text = "Текст (от лат. textus - ткань; сплетение, сочетание) - зафиксированная на каком-либо материальном носителе человеческая мысль;";
        int length = text.length();

        System.out.println(length);
    }

    static void countUniqueWords(String str) {
        // Create a new Map by creating object of HashMap
        // class
        HashMap<String, Integer> map = new LinkedHashMap<>();
        int count = 0;

        // Extract words from string
        // using split() method
        String[] words = str.split(" ");

        // Iterating over the words array
        // using for each loop
        for (String word : words) {

            // If the word is present in array then
            //
            if (map.containsKey(word)) {

                //  Increment its value by one
                // using map.get() method
                map.put(word, map.get(word) + 1);
            }

            // Else store the word inside map
            // with value one
            else
                map.put(word, 1);
        }

        // Iterate over the map using for each loop
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {

            // If value of words equals unity
            if (entry.getValue() == 1)
                count++;


            // Print all those words
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        // Custom input string
        String str = "Текст (от лат. textus - ткань; сплетение, сочетание) - зафиксированная на каком-либо материальном носителе человеческая мысль;";

        // Calling the Method1 to
        // print all unique words in above string
        countUniqueWords(str);
    }
}