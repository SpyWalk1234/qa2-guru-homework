package tests.api;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataTypesTests {

    @Test
    public void printPersonData() {
        String name = "Nikita";
        String surname = "Kuznecovs";
        byte age = 30;
        LocalDate dateOfBirth = LocalDate.parse("19940704", DateTimeFormatter.BASIC_ISO_DATE);
        String email = "stalker00719@gmail.com";
        String gender = "male";
        Boolean carExistence = false;
        String personalIdNumber = "040794-23456";
        String address = "Ranka Dambis 9";
        Short height = 175;
        Short weight = 73;

        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(dateOfBirth, today);
        //Period period = Period.between(dateOfBirth, today);
        System.out.println("Hi, my name is" + " " + name + " " + "and I'm" + " " + age + "\n" + "My birthday is" + " " + DateTimeFormatter.ofPattern("dd/MMM/yyyy", Locale.ENGLISH).format(dateOfBirth));
        System.out.println(days);

    }
}