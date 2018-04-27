package danielConlin.name;


public class BasicName {

    private String firstName;
    private String lastName;

    public BasicName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public BasicName(String firstName) {
        setFirstName(firstName);
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

    public String toString() {
        return firstName + " " + lastName;
    }
}
