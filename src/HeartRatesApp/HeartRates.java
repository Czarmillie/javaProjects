import java.time.LocalDate;
import java.time.Month;

public class HeartRates {

    private String firstName;

    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, int day, String month, int year) {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        this.lastName = lastName;
        return lastName;
    }

    public void setDateOfBirth(int day, String month, int year) {
        dateOfBirth = LocalDate.of(day, Month.valueOf(month), year);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
