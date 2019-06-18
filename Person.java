package lab2;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth;

    public Person() {
        this.dateOfBirth = new Date();
        this.firstName = "brak";
        this.lastName = "brak";
    }

    public Person(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        Format formatter = new SimpleDateFormat("yyy-MM-dd");
        String str = String.format("First name: %s, Last Name: %s, Date of Birth: %s", firstName, lastName, formatter.format(dateOfBirth));
        return str;
    }

    public void details() {
        System.out.println(toString());
    }

}//KONIEC KLASY PERSON
