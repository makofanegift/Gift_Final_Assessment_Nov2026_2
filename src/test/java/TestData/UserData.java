package TestData;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class UserData {

    private final Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = (firstName + "." + lastName)
            .toLowerCase(Locale.ROOT)
            .replaceAll("[^a-z0-9.]", "")
            +faker.number().numberBetween(100, 999)
            + "@gmail.com";
    String password = "@12345678";

//    @Test
//    public void test (){
//        System.out.println("First Name " + firstName + " : Last Name " + lastName + " : Email " + email);
//    }
}
