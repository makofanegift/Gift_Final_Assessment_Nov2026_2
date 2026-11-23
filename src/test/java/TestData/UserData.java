package TestData;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class UserData {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password = "@12345678";

    public UserData(){
        Faker faker = new Faker();
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = (firstName + "." + lastName)
                .toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9.]", "")
                + faker.number().numberBetween(100, 999)
                + "@gmail.com";
    }

    public String getFirstName(){
        return firstName;

    }
    public String getLastName(){
        return lastName;

    }
    public String getEmail(){
        return email;

    }
    public String getPassword(){
        return password;

    }
}
